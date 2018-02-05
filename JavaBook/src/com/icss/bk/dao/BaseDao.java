package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	
	protected Connection conn; 
	public void openConnection()throws Exception {
		if(this.conn == null||this.conn.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");//�÷��似������̬�������ݿ�����������Ҫnew��
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/NMZ9","nmz9","1234");
		}
	}
	
	public void closeConnection() {
		if(this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
