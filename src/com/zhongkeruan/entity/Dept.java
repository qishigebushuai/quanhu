package com.zhongkeruan.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {
	private String id;
	private String name;
	private List<Empt> list;
	public Dept(String id, String name, List<Empt> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	public Dept(String name) {
		super();
		this.name = name;
	}
	public Dept() {
		super();
	}
	public Dept(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public List<Empt> getList() {
		return list;
	}
	public void setList(List<Empt> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
	
}
