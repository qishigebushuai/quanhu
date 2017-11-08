package com.zhongkeruan.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.zhongkeruan.entity.User;

public class Jihe {
	public static void main(String[] args) {
		Map<User,Integer> map=new HashMap<>();
		map.put(new User("zhang3", "123456"), 58);
		map.put(new User("li4", "123456"), 58);
		map.put(new User("wang5", "123456"), 58);
		map.put(new User("ma6", "123456"), 58);
		map.put(new User("chen2", "123456"), 58);
		map.put(new User("faker", "123456"), 58);
		Iterator<User> useres = map.keySet().iterator();
		while(useres.hasNext()){
			/*if("chen2".equals(useres.next().getUserName())){
				useres.remove();
			}*/
			System.out.println(useres.next());
		}
		System.out.println("----------------------");
		Set<User> keySet = map.keySet();
		for (User user : keySet) {
			System.out.println(user+"---"+map.get(user));
		}
		System.out.println("aaaa");
		
	}
}
