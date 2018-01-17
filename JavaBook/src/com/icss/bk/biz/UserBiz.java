package com.icss.bk.biz;

import com.icss.bk.dao.UserDao;
import com.icss.bk.entity.User;

public class UserBiz {
		/**
		 * 用户注册
		 * 
		 */
	public boolean regist(User user) {
		boolean bRet = false;
		if(user != null) {
			UserDao dao = new UserDao();
			bRet = dao.regist(user); 
		}
		return bRet; 
		
	}
	
	
	
	
	
	/**
	 * 用户登录
	 * @param uname
	 * @param pwd
	 * @return
	 */
	
	
	public User login(String uname,String pwd) {	 
	User user = null;
	if(uname != null && pwd != null&& !uname.equals("")) {	
		UserDao dao = new UserDao();
		user = dao.login(uname,pwd);		
	}
	return user;	
	}
}

