package com.icss.bk.biz;

import com.icss.bk.dao.BookDao;
import com.icss.bk.entity.Book;

public class BookBiz {
	
	public 	boolean addBook(Book book) {
		boolean bRet = false;
		if(book!= null) {
			BookDao dao =new BookDao();
			bRet = dao.addBook(book);
		}
		return false;
	}
}
