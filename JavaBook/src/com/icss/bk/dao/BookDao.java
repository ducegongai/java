package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.icss.bk.entity.Book;

public class BookDao {
	public 	boolean addBook(Book book) {
		//�����ݿ�
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");//�÷��似������̬�������ݿ�����������Ҫnew��
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456")
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		return false;
	}

}
