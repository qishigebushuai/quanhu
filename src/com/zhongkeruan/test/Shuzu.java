package com.zhongkeruan.test;

public class Shuzu {
	public static void main(String[] args) {
		int [] a={16,10,3,6,15};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		int[] maopao = maopao(a);
		for (int i = 0; i < maopao.length; i++) {
			System.out.print(maopao[i]+"\t");
		}
		
	}

	private static int[] maopao(int[] a) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		return a;
	}
}
