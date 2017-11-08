package com.zhongkeruan.service.impl;

import java.util.UUID;

import com.zhongkeruan.dao.UserDao;
import com.zhongkeruan.entity.User;
import com.zhongkeruan.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public User selectUser(String userName) {
		
		return userDao.selectUser(userName);
	}

}
