package com.zhongkeruan.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class Intercepter implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		ValueStack vs = ai.getStack();
		Object object = vs.findValue("#session.Myuser");
		if(object==null){
			return "error";
		}else{
			ai.invoke();
			return null;
		}
	}

}
