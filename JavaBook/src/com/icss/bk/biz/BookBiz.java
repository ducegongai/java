package com.icss.bk.biz;

import java.sql.SQLIntegrityConstraintViolationException;

import com.icss.bk.dao.BookDao;
import com.icss.bk.entity.Book;

public class BookBiz {
	
	public 	void addBook(Book book)throws SQLIntegrityConstraintViolationException,Exception {
		if(book!= null) {
			BookDao dao =new BookDao();
			dao.addBook(book);
		}
		
	}
}
