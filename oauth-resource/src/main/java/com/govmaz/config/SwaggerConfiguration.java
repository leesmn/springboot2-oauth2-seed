package com.govmaz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  @Bean
  public Docket createRestApi() {
    //添加header参数
    ParameterBuilder ticketPar = new ParameterBuilder();
    List<Parameter> pars = new ArrayList<>();
    ticketPar.name("Authorization").description("bearer + access_token")
            .modelRef(new ModelRef("string")).parameterType("header")
            .required(false).build(); //header中的ticket参数非必填，传空也可以
             pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.govmaz.controller"))
        .paths(PathSelectors.any())
        .build()
        .globalOperationParameters(pars);
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("政策查API接口文档")
        .description("")
        .version("1.0")
        .build();
  }

//  @Bean
//  public Docket docket() {
//    return new Docket(DocumentationType.SWAGGER_2).groupName("工单引擎swagger接口文档")
//        .apiInfo(new ApiInfoBuilder().title("工单引擎swagger接口文档")
//            .contact(new Contact("华建盛裕", "", "tecservice@aifmworld.com")).version("1.0").build())
//        .select().paths(PathSelectors.any()).build();
//  }
}
