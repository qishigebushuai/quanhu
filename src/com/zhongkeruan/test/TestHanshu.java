package com.zhongkeruan.test;

public class TestHanshu {
	public static void main(String[] args) {
		System.out.println("������ɽ����");
		fuhao(1,'@');
		System.out.println("�ƺ��뺣����");
		fuhao(5,'e');
		System.out.println("����ǧ��Ŀ��");
		fuhao(10,'a');
		System.out.println("����һ��¥��");
		fuhao(15,'*');
		double sum = add(15,20);
		System.out.println(sum);
		double jiechen = jiechen(5);
		System.out.println("�׳ˣ�"+jiechen);
	}

	private static double jiechen(int i) {
		if(i==1){
			return 1;
		}else{
			return i*jiechen(i-1);
		}
	}
	
	private static double add(int i, int j) {
		return i+j;
	}

	private static void fuhao(int a,char b) {
		for (int i = 0; i < a; i++) {
			System.out.print(b);
		}
		System.out.println("");
	}
	
	
}
