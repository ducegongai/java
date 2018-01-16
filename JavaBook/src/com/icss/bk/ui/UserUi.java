package com.icss.bk.ui;

import com.icss.bk.biz.UserBiz;
import com.icss.bk.entity.User;

public class UserUi {
	
	public void logintest() {
		UserBiz biz = new UserBiz();
		User u = biz.login("tom","abc");
		if(u == null) {
			System.out.println("error");
		}
		else
		{
			System.out.println(u.getUname() + "--login successfully");
		}  
	}
	
	public static void main(String[] args) {
		UserUi ui = new UserUi();
		ui.logintest();
		System.out.println("the program is running");
		
	}

}
