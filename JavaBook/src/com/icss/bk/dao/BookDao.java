package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import com.icss.bk.entity.Book;

public class BookDao {
	public 	void addBook(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
		
			
			
			
			//�����ݿ�
			Class.forName("oracle.jdbc.driver.OracleDriver");//�÷��似������̬�������ݿ�����������Ҫnew��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			
			
			//���ͼ��
			//String sql = "insert into tbook(isbn,bname,author,price) values(?,?,?,?)";
			String sql = "insert into tbook��isbn,bname�� values("+book.getIsbn()+","+book.getBname()+")";
			PreparedStatement ps = 	conn.prepareStatement(sql);
			Statement st = conn.createStatement(); 
			ps.setString(1,book.getIsbn());
			ps.setString(2, book.getBname());
			ps.setString(3,book.getAuthor());
			ps.setString(4,book.getPress());
			long now = book.getPdate().getTime();
			ps.setDate(5,new java.sql.Date(now));     //��Ҫ��Java.util.Dataת����java.sql.data
			ps.setDouble(6,book.getPrice());
			ps.setInt(7,book.getKcount());
			ps.setString(8,book.getPicurl());
			ps.executeUpdate();
			
					
					
			
			//�ر����ݿ�		
			conn.close();
		
		
		//�ر����ݿ�
		
		
		
		
		
		
		
	
	}
	
	
	
public 	void addBook2333	(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
		
			
			
			
			//�����ݿ�
			Class.forName("oracle.jdbc.driver.OracleDriver");//�÷��似������̬�������ݿ�����������Ҫnew��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			
			
			//���ͼ��
			//String sql = "insert into tbook(isbn,bname,author,price) values(?,?,?,?)";
			String sql = "insert into tbook values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = 	conn.prepareStatement(sql);
			ps.setString(1,book.getIsbn());
			ps.setString(2, book.getBname());
			ps.setString(3,book.getAuthor());
			ps.setString(4,book.getPress());
			long now = book.getPdate().getTime();
			ps.setDate(5,new java.sql.Date(now));     //��Ҫ��Java.util.Dataת����java.sql.data
			ps.setDouble(6,book.getPrice());
			ps.setInt(7,book.getKcount());
			ps.setString(8,book.getPicurl());
			ps.executeUpdate();
			
					
					
			
			//�ر����ݿ�		
			conn.close();
		
		
		//�ر����ݿ�
		
		
		
		
		
		
		
	
	}
}
