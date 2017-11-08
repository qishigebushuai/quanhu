package com.zhongkeruan.test;


import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhongkeruan.entity.Dept;
import com.zhongkeruan.entity.Empt;
import com.zhongkeruan.service.DeptService; 

public class TestDept {
	private ApplicationContext ctx;
	private DeptService ds;
	
	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ds=(DeptService) ctx.getBean("deptService");
	}
	
	@Test
	public void add(){
		Dept dept = new Dept("45688","开发部");
		int add = ds.add(dept);
		System.out.println("我是今天才发现,做修改操作会有返回值的:"+add);
	}
	
	@Test
	public void delete(){
		ds.delete("c0ccd");
	}
	
	@Test
	public void update(){
		Dept dept = new Dept("0eb53","行政部");
		ds.update(dept);
	}
	
	@Test
	public void select(){
		Dept dept = ds.selectEmpt("0eb53");
		List<Empt> list = dept.getList();
		for (Empt empt : list) {
			System.out.println(empt);
		}
	}
	
	@Test
	public void selectAll(){
		List<Dept> list = ds.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}
	
}
