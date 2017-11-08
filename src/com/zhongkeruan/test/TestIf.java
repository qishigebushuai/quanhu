package com.zhongkeruan.test;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		System.out.println("请输入一句话：");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println("你输入的字符串是："+a);
		int b=sc.nextInt();
		System.out.println("你输入的整数是："+b);
		char c=sc.next().charAt(0);
		System.out.println("你输入的字符是："+c);
		double d=sc.nextDouble();
		System.out.println("你输入的小数是："+d);
	}
}
