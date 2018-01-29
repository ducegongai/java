package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.icss.bk.biz.IRole;
import com.icss.bk.entity.User;

public class UserDao extends BaseDao{
	/**
	 * �û�ע��
	 */
	public boolean regist(User user) {
		
		Connection conn = null;
		
		try {
			
			//�����ݿ�
			this.openConnection();
			
			//create the PreparedStatement object
			String sql = "insert into tuser values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,user.getUname());
			ps.setString(2, user.getPwd());
			ps.setInt(3,user.getRole());
			ps.setString(4,user.getAddress());
			ps.executeUpdate();
					
			
			//�ر����ݿ�		
			this.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
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
