package com.zhongkeruan.service.impl;

import java.util.List;
import java.util.UUID;

import com.zhongkeruan.dao.DeptDao;
import com.zhongkeruan.entity.Dept;
import com.zhongkeruan.service.DeptService;

public class DeptServiceImpl implements DeptService {
	private DeptDao deptDao;
	
	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public int add(Dept dept) {
		dept.setId(UUID.randomUUID().toString().replace(",", "").substring(0, 5));
		return deptDao.add(dept);
	}

	@Override
	public int delete(String id) {
		return deptDao.delete(id);

	}

	@Override
	public int update(Dept dept) {
		return deptDao.update(dept);
	}

	@Override
	public Dept selectDept(String id) {
		
		return deptDao.selectDept(id);
	}

	@Override
	public Dept selectEmpt(String id) {
		
		return deptDao.selectEmpt(id);
	}

	@Override
	public List<Dept> selectAll() {
		return deptDao.selectAll();
	}

}
