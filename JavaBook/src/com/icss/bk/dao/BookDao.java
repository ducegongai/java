package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import com.icss.bk.entity.Book;

public class BookDao {
	public 	void addBook(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
		
			
			
			
			//打开数据库
			Class.forName("oracle.jdbc.driver.OracleDriver");//用反射技术，动态加载数据库驱动（不需要new）
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			
			
			//添加图书
			//String sql = "insert into tbook(isbn,bname,author,price) values(?,?,?,?)";
			String sql = "insert into tbook（isbn,bname） values("+book.getIsbn()+","+book.getBname()+")";
			PreparedStatement ps = 	conn.prepareStatement(sql);
			Statement st = conn.createStatement(); 
			ps.setString(1,book.getIsbn());
			ps.setString(2, book.getBname());
			ps.setString(3,book.getAuthor());
			ps.setString(4,book.getPress());
			long now = book.getPdate().getTime();
			ps.setDate(5,new java.sql.Date(now));     //需要把Java.util.Data转换成java.sql.data
			ps.setDouble(6,book.getPrice());
			ps.setInt(7,book.getKcount());
			ps.setString(8,book.getPicurl());
			ps.executeUpdate();
			
					
					
			
			//关闭数据库		
			conn.close();
		
		
		//关闭数据库
		
		
		
		
		
		
		
	
	}
	
	
	
public 	void addBook2333	(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
		
			
			
			
			//打开数据库
			Class.forName("oracle.jdbc.driver.OracleDriver");//用反射技术，动态加载数据库驱动（不需要new）
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:orcl","nmz9","123456");
			
			
			//添加图书
			//String sql = "insert into tbook(isbn,bname,author,price) values(?,?,?,?)";
			String sql = "insert into tbook values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = 	conn.prepareStatement(sql);
			ps.setString(1,book.getIsbn());
			ps.setString(2, book.getBname());
			ps.setString(3,book.getAuthor());
			ps.setString(4,book.getPress());
			long now = book.getPdate().getTime();
			ps.setDate(5,new java.sql.Date(now));     //需要把Java.util.Data转换成java.sql.data
			ps.setDouble(6,book.getPrice());
			ps.setInt(7,book.getKcount());
			ps.setString(8,book.getPicurl());
			ps.executeUpdate();
			
					
					
			
			//关闭数据库		
			conn.close();
		
		
		//关闭数据库
		
		
		
		
		
		
		
	
	}
}
