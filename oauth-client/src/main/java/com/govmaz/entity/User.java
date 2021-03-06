package com.govmaz.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author jv_team
 * @email 
 * @date 2020-06-15 12:52:01
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //用户id
    private Integer userId;
	
	    //用户名称,手机号
    private String username;
	
	    //密码
    private String password;
	
	    //
    private Date createTime;
	
	    //0，删除；1，正常
    private Boolean dataStatus;
	

	/**
	 * 设置：用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：用户名称,手机号
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名称,手机号
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：0，删除；1，正常
	 */
	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}
	/**
	 * 获取：0，删除；1，正常
	 */
	public Boolean getDataStatus() {
		return dataStatus;
	}
}
