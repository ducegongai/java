package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.icss.bk.entity.Book;

public class BookDao extends BaseDao{
	
	/**
	 * 添加图书
	 * @param book
	 * @throws SQLIntegrityConstraintViolationException
	 * @throws Exception
	 */
	
	
	public 	void addBook(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
			
			
			//打开数据库
			this.openConnection();
			
			//添加图书
			//String sql = "insert into tbook(isbn,bname,author,price) values(?,?,?,?)";
			String sql = "insert into tbook（isbn,bname） values('"+ book.getIsbn() +","+ book.getBname() +"')";
			Statement st = conn.createStatement(); 
			st.executeUpdate(sql);
			//关闭数据库		
			this.closeConnection();
		
		
		//关闭数据库
		
		
		
		
		
		
		
	
	}
	
	
	
public 	void addBook2333	(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		
		Connection conn = null;
		
			
			
			
			//打开数据库
			this.openConnection();
			
			
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
			this.closeConnection();
		
		
		//关闭数据库
		
		
		
		
		
		
		
	
	}
}
