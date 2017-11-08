package com.zhongkeruan.test;


import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongkeruan.entity.User;
import com.zhongkeruan.service.UserService;


public class UserAll {
	private ApplicationContext ctx;
	private UserService us;
	
	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		us=(UserService) ctx.getBean("userService");
	}
	
	@Test
	public void add(){
		User user = new User("zw12", "wang5", "123","ÍõÎå");
		us.addUser(user);
	}
	
	@Test
	public void select(){
		User user = us.selectUser("wang5");
		System.out.println(user);
	}
	
	@Test
	public void UUID1(){
		String string = UUID.randomUUID().toString();
		String string2 = string.replace("-", "**");
//		int int1 = Integer.parseInt(string2);
		System.out.println(string);
		System.out.println(string2);
//		System.out.println(int1);
	}
	
}
