package com.icss.bk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.icss.bk.entity.Book;

public class BookDao {
	public 	boolean addBook(Book book) {
		
		Connection conn = null;
		
		try {
			
			
			
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
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
		//�ر����ݿ�
		
		
		
		
		
		
		
		return false;
	}

}
