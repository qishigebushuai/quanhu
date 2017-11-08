package com.zhongkeruan.service;

import com.zhongkeruan.entity.User;

public interface UserService {
	public void addUser(User user);
	
	public User selectUser(String userName);
}
