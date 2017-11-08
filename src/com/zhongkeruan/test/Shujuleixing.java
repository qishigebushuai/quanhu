package com.zhongkeruan.test;

public class Shujuleixing {
	public static void main(String[] args) {
		int a=20;
		Integer a1 = new Integer(a);//int-->Integer
		System.out.println(a1);
		String a2 = a1.toString();//Integer-->String
		System.out.println(a2);
		int a3 = Integer.parseInt(a2);//String-->int
		System.out.println(a3);
		String a4=a3+"";//int-->String
		System.out.println(a4);
		Integer a5 = Integer.valueOf(a4);//String-->Integer
		System.out.println(a5);
		int a6 = a5.intValue();//Integer-->int
		System.out.println(a6);
		
	}
}
