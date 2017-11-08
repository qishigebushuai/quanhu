package com.zhongkeruan.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongkeruan.entity.Dept;
import com.zhongkeruan.entity.Empt;
import com.zhongkeruan.service.DeptService;
import com.zhongkeruan.service.EmptService;

public class TestEmpt {
	private ApplicationContext ctx;
	private EmptService es;
	
	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		es=(EmptService) ctx.getBean("emptService");
	}
	
	@Test
	public void add(){
		Empt empt = new Empt("mayun", new Dept("0eb53","ÐÐÕþ²¿"));
		es.add(empt);
	}
	
	@Test
	public void delete(){
		es.delete("36a33");
	}
	
	@Test
	public void update(){
		Empt empt = new Empt("f241f","wang5", new Dept("awwes", ""));
		es.update(empt);
	}
	
	@Test
	public void select(){
		Empt empt = es.selectEmpt("f241f");
		System.out.println(empt);
	}
	
	@Test
	public void selectAll(){
		List<Empt> list = es.selectAll("0eb53");
		for (Empt empt : list) {
			System.out.println(empt);
		}
	}
	
}
