package com.zhongkeruan.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhongkeruan.entity.Dept;
import com.zhongkeruan.entity.Empt;
import com.zhongkeruan.service.DeptService;
import com.zhongkeruan.service.EmptService;

public class DeptAction {
	private DeptService deptService;
	private EmptService emptService;
	
	private List<Dept> list;
	private List<Empt> list2;
	private List<Dept> list3;
	public List<Dept> getList3() {
		return list3;
	}

	public void setList3(List<Dept> list3) {
		this.list3 = list3;
	}

	private Map<String,Dept> map;
	private Dept dept;
	private String id;
	private String name;

	public Map<String,Dept> getMap() {
		return map;
	}

	public void setMap(Map<String,Dept> map) {
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	
	public String queryDept() throws IOException{
		list=deptService.selectAll();
		String string = JSONObject.toJSONString(list);
		System.out.println(string);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(string);
		return Action.NONE;
	}
	
	public String queryAll(){
		list=deptService.selectAll();
		ValueStack vs = ActionContext.getContext().getValueStack();
	    Object object = vs.findValue("#session.Mymap");
	    if(object==null){
	    	map=new HashMap<>();
	    	vs.setValue("#session.Mymap", map);
	    }
		return "queryAllOk";
	}
	
	public String add(){
		int add = deptService.add(dept);
		System.out.println("Ìí¼Ó:"+add);
		return "addOk";
	}
	
	public String delete(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		Object object = vs.findValue("#session.Mymap");
		Dept dept2 = deptService.selectEmpt(id);
		List<Empt> list3 = dept2.getList();
		if(object==null){
			map=new HashMap<>();
			map.put(dept2.getId(), dept2);
			vs.setValue("#session.Mymap", map);
		}else{
			map=(Map<String,Dept>) object;
			map.put(dept2.getId(), dept2);
			vs.setValue("#session.Mymap", map);
		}
		for (Empt empt : list3) {
			emptService.delete(empt.getId());
		}
		int delete = deptService.delete(id);
		System.out.println("É¾³ý:"+delete);
		return "deleteOk";
	}
	
	public String huifu(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		map=(Map<String,Dept>) vs.findValue("#session.Mymap");
		Dept dept2 = map.get(id);
		deptService.add(dept2);
		map.remove(id, dept2);
		vs.setValue("#session.Mymap", map);
		return "huifuOk";
	}
	
	public String selectOne(){
		dept=deptService.selectDept(id);
		return "selectOneOk";
	}
	
	public String update(){
		int update = deptService.update(dept);
		System.out.println("ÐÞ¸Ä:"+update);
		return "updateOk";
	}
	
	public String queryAllEmpts(){
		dept = deptService.selectEmpt(id);
		list2 = dept.getList();
		return "queryAllEmptsOk";
	}
	
	public List<Dept> getList() {
		return list;
	}

	public void setList(List<Dept> list) {
		this.list = list;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
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

	public EmptService getEmptService() {
		return emptService;
	}

	public void setEmptService(EmptService emptService) {
		this.emptService = emptService;
	}
	
	
	
	
	
	
}
