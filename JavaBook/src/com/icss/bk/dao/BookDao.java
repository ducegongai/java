package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.icss.bk.entity.Book;

public class BookDao {
	public 	boolean addBook(Book book) {
		
		Connection conn = null;
		//�����ݿ�
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");//�÷��似������̬�������ݿ�����������Ҫnew��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			PreparedStatement ps = conn.prepareStatement(sql);
					
					
			
			//�ر����ݿ�		
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
		//�ر����ݿ�
		
		
		
		
		
		
		
		return false;
	}

}
