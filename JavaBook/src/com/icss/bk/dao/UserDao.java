package com.icss.bk.dao;

import com.icss.bk.biz.IRole;
import com.icss.bk.entity.User;

public class UserDao {
	/**
	 * �û�ע��
	 */
	public boolean regist(User user) {
		return true;
	}
	
	
	
	/**
	 * �û���¼
	 * @param uname
	 * @param pwd
	 * @return
	 */
	public User login(String uname,String pwd) {
		User user = null;
		if(uname.equals("tom")&&pwd.equals("abc")) {
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("hbshss");
			user.setRole(IRole.COMMON_USER);
		}else if(uname.equals("admin")&&pwd.equals("123")) {
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("hbsxfs");
			user.setRole(IRole.ADMIN);
			
		}else {
			
		}
		return user;
	}

}
