package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.icss.bk.biz.IRole;
import com.icss.bk.entity.User;

public class UserDao {
	/**
	 * 用户注册
	 */
	public boolean regist(User user) {
		
		Connection conn = null;
		
		try {
			
			//打开数据库
			Class.forName("oracle.jdbc.driver.OracleDriver");//用反射技术，动态加载数据库驱动（不需要new）
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			
			//create the PreparedStatement object
			String sql = "insert into tuser values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,user.getUname());
			ps.setString(2, user.getPwd());
			ps.setInt(3,user.getRole());
			ps.setString(4,user.getAddress());
			ps.executeUpdate();
					
			
			//关闭数据库		
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
		return true;
	}
	
	
	
	/**
	 * 用户登录
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
