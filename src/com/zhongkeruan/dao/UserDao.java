package com.zhongkeruan.dao;

import com.zhongkeruan.entity.User;

public interface UserDao {
	public void addUser(User user);
	
	public User selectUser(String userName);
	
}
