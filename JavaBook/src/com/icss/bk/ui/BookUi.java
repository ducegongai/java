package com.icss.bk.ui;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;

import com.icss.bk.biz.BookBiz;
import com.icss.bk.entity.Book;

public class BookUi {
	public static void addBookTest(){
		BookBiz biz = new BookBiz();
		Book book = new Book();
		book.setIsbn("is003"); 
		book.setBname("红楼梦");
		book.setAuthor("曹雪芹");
		book.setPress("rmcbs");
		book.setKcount(100);
		book.setPdate(new Date());            //当前时间
		book.setPrice(33.5);
		book.setPicurl(null);
 		try {
 			biz.addBook(book);
 			System.out.println("successed");
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println(e.getSQLState());
			if(e.getSQLState().equals("23000")) {
				System.out.println("你输入的ISBN值，数据库中已经存在了");
				
			}
			
		}catch (Exception e) {
			System.out.println("erorr");
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	public static void main(String[] args) {
 		BookUi.addBookTest();
		System.out.println("program is over");
	} 

}
