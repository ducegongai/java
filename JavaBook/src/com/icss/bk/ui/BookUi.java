package com.icss.bk.ui;

import java.util.Date;

import com.icss.bk.biz.BookBiz;
import com.icss.bk.entity.Book;

public class BookUi {
	public static void addBookTest(){
		BookBiz biz = new BookBiz();
		Book book = new Book();
		book.setIsbn("is002");
		book.setBname("水浒传");
		book.setAuthor("jack");
		book.setPress("rmcbs");
		book.setKcount(100);
		book.setPdate(new Date());            //当前时间
		book.setPrice(33.5);
		book.setPicurl(null);
 		boolean bRet = biz.addBook(book);
		if(bRet) {
			System.out.println("successed");
		}
		else {
			System.out.println("erorr");
		}
		
	}
	public static void main(String[] args) {
 		BookUi.addBookTest();
		System.out.println("program is over");
	} 

}
