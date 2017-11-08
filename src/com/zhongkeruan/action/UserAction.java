package com.zhongkeruan.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhongkeruan.entity.User;
import com.zhongkeruan.service.UserService;

public class UserAction {
	private UserService userService;
	private User user;//使用成员变量传递参数
	private String mess;
	private String image;
	
	public String login(){//登录
		ValueStack vs = ActionContext.getContext().getValueStack();
		String img = (String) vs.findValue("#session.image");
		if(img.equals(image)){
			System.out.println(user);
			String userName = user.getUserName();
			User user2 = userService.selectUser(userName);
			if(user2==null){
				mess="账号不存在";
				return "loginError";
			}else{
				String password = user2.getPassword();
				if(password.equals(user.getPassword())){
					vs.setValue("#session.Myuser", user2);
					return "loginOk";
				}else{
					mess="密码错误";
					return "loginError";
				}
			}
		}else{
			mess="验证码错误";
			return "loginError";
		}
		
	}
	
	public String regist(){//注册
		ValueStack vs = ActionContext.getContext().getValueStack();
		String img=(String) vs.findValue("#session.image");
		if(img.equals(image)){
			String userName = user.getUserName();
			User user2 = userService.selectUser(userName);
			if(user2==null){
				user.setId(UUID.randomUUID().toString().replace("-", "").substring(0, 5));
				userService.addUser(user);
				mess="注册成功!";
				return "registOk";
			}else{
				mess="用户名已存在,请更换用户名!";
				return "registError";
			}
		}else{
			mess="验证码错误";
			return "registError";
		}
		
		
	}
	
	public String esc(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.Myuser", null);
		return "escOk";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	
	
}
