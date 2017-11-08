package com.zhongkeruan.entity;

import java.io.Serializable;

public class Empt implements Serializable {
	private String id;
	private String name;
	private Dept dept;
	public Empt(String id, String name, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Empt(String name, Dept dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public Empt() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Empt [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
	
	
	
	
}
