package com.zhongkeruan.service;

import java.util.List;

import com.zhongkeruan.entity.Dept;

public interface DeptService {
	
	public int add(Dept dept);
	public int delete(String id);
	public int update(Dept dept);
	public Dept selectDept(String id);
	public Dept selectEmpt(String id);
	public List<Dept> selectAll();
	
}
