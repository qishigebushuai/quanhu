package com.zhongkeruan.service.impl;

import java.util.List;
import java.util.UUID;

import com.zhongkeruan.dao.EmptDao;
import com.zhongkeruan.entity.Empt;
import com.zhongkeruan.service.EmptService;

public class EmptServiceImpl implements EmptService {
	private EmptDao emptDao;

	public EmptDao getEmptDao() {
		return emptDao;
	}

	public void setEmptDao(EmptDao emptDao) {
		this.emptDao = emptDao;
	}

	@Override
	public void add(Empt empt) {
		empt.setId(UUID.randomUUID().toString().replace(",", "").substring(0,5));
		emptDao.add(empt);
	}

	@Override
	public void delete(String id) {
		emptDao.delete(id);
	}

	@Override
	public void update(Empt empt) {
		emptDao.update(empt);
	}

	@Override
	public Empt selectEmpt(String id) {
		return emptDao.selectEmpt(id);
	}

	@Override
	public List<Empt> selectAll(String deptId) {
		
		return emptDao.selectAll(deptId);
	}

}
