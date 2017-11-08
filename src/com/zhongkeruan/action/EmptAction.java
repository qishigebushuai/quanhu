package com.zhongkeruan.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhongkeruan.entity.Dept;
import com.zhongkeruan.entity.Empt;
import com.zhongkeruan.service.EmptService;

public class EmptAction {
	private EmptService emptService;
	private Empt empt;
	private Dept dept;
	private String id;
	private List<Empt> list2;

	public EmptService getEmptService() {
		return emptService;
	}

	public void setEmptService(EmptService emptService) {
		this.emptService = emptService;
	}
	
	public String add(){
		emptService.add(empt);
		
		return "addOk";
	}
	
	public String queryAll(){
		dept=empt.getDept();
		list2=emptService.selectAll(empt.getDept().getId());
		return "queryAllOk";
	}
	
	public String delete(){
		empt=emptService.selectEmpt(id);
		emptService.delete(id);
		return "deleteOk";
	}
	
	public String selectOne(){
		empt=emptService.selectEmpt(id);
		return "selectOneOk";
	}
	
	public String update(){
		emptService.update(empt);
		return "updateOk";
	}

	public Empt getEmpt() {
		return empt;
	}

	public void setEmpt(Empt empt) {
		this.empt = empt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Empt> getList2() {
		return list2;
	}

	public void setList2(List<Empt> list2) {
		this.list2 = list2;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
}
