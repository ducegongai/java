package com.icss.bk.ui;

import com.icss.bk.biz.BookBiz;
import com.icss.bk.entity.Book;

public class BookUi {
	public static void addBookTest(){
		BookBiz biz = new BookBiz();
		Book book = new Book();
		book.setIsbn("is001");
		book.setBname("ºìÓëºÚ");
		book.setAuthor("Tom");
		book.setPress("rmcbs");
		book.setKcount(200);
		book.setPrice(23.5);
		boolean bRet = biz.addBook(book);
		if(bRet) {
			System.out.println("successed");
		}
		else {
			System.out.println("erorr");
		}
		
	}
	public 

}
