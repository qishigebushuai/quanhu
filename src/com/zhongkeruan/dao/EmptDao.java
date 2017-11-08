package com.zhongkeruan.dao;

import java.util.List;

import com.zhongkeruan.entity.Empt;

public interface EmptDao {
	
	public void add(Empt empt);
	public void delete(String id);
	public void update(Empt empt);
	public Empt selectEmpt(String id);
	public List<Empt> selectAll(String deptId);
	
}
