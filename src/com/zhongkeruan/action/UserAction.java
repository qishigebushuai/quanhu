package com.zhongkeruan.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhongkeruan.entity.User;
import com.zhongkeruan.service.UserService;

public class UserAction {
	private UserService userService;
	private User user;//ʹ�ó�Ա�������ݲ���
	private String mess;
	private String image;
	
	public String login(){//��¼
		ValueStack vs = ActionContext.getContext().getValueStack();
		String img = (String) vs.findValue("#session.image");
		if(img.equals(image)){
			System.out.println(user);
			String userName = user.getUserName();
			User user2 = userService.selectUser(userName);
			if(user2==null){
				mess="�˺Ų�����";
				return "loginError";
			}else{
				String password = user2.getPassword();
				if(password.equals(user.getPassword())){
					vs.setValue("#session.Myuser", user2);
					return "loginOk";
				}else{
					mess="�������";
					return "loginError";
				}
			}
		}else{
			mess="��֤�����";
			return "loginError";
		}
		
	}
	
	public String regist(){//ע��
		ValueStack vs = ActionContext.getContext().getValueStack();
		String img=(String) vs.findValue("#session.image");
		if(img.equals(image)){
			String userName = user.getUserName();
			User user2 = userService.selectUser(userName);
			if(user2==null){
				user.setId(UUID.randomUUID().toString().replace("-", "").substring(0, 5));
				userService.addUser(user);
				mess="ע��ɹ�!";
				return "registOk";
			}else{
				mess="�û����Ѵ���,������û���!";
				return "registError";
			}
		}else{
			mess="��֤�����";
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
