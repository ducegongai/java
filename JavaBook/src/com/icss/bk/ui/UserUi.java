package com.icss.bk.ui;

import com.icss.bk.biz.IRole;
import com.icss.bk.biz.UserBiz;
import com.icss.bk.entity.User;

public class UserUi {
	public static void registTest() {
		UserBiz biz = new UserBiz();
		User u = new User();
		u.setUname("jack");
		u.setPwd("123");
		u.setRole(IRole.VIP_USER);
		u.setAddress("hbswhs");
		boolean bRet = biz.regist(u);
		if(bRet) {
			System.out.println(u.getUname() + " registed successfully");
		}
		else {
			System.out.println(u.getUname() + " registed unsuccessfully");
		}
	}
	
	
	
	
	
	
	public void logintest() {
		UserBiz biz = new UserBiz();
		try {
			User u = biz.login("tom","abc");
			if(u == null) {
				System.out.println("error");
			}
			else
			{
				System.out.println(u.getUname() + "--login successfully");
			}  
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Õ¯¬Á“Ï≥£");
		}
			// TODO: handle exception
		}
		
		
	
	public static void main(String[] args) {
		//UserUi ui = new UserUi();
		//ui.logintest();
		UserUi.registTest();
		System.out.println("the program is running");
		
	}

}
