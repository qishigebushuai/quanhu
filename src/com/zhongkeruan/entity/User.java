package com.zhongkeruan.entity;

import java.io.Serializable;

public class User implements Serializable {
	private String id;
	private String userName;
	private String password;
	private String realName;
	public User(String id, String userName, String password, String realName) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password, String realName) {
		super();
		this.userName = userName;
		this.password = password;
		this.realName = realName;
	}
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", realName=" + realName + "]";
	}
	
	
	
	
	
	
}
