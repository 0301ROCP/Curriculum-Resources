package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Book;
import com.example.repo.BookDao;

public class Service {
	
	

	public Service(BookDao bDao) {
		super();
		this.bDao = bDao;
	}

	private BookDao bDao;
	
	public boolean withdraw(int bookId) {
		
		/*
		 * What will this method do?
		 * 
		 * Once it's withdrawn, no one else should be able to withdraw it!
		 * 
		 * 
		 */
		
		boolean success = false;
		
		Book b = bDao.selectBookById(bookId);
		
		if(b.isAvailable()) {
			b.setAvailable(false);
			
			bDao.updateAvailablity(b, b.isAvailable());
			success = true;
		}else {
			System.out.println("Can't withdraw!"); // look a lot like presentation logic!
			
		}
		
		return success;
		
	}
	
	public void deposit() {
		
		
	}

	public List<Book> getAllBooks(){
		
		List<Book> allBooks = new ArrayList<Book>();

		
		allBooks = bDao.selectAllBooks();
		
		List<Book> availableBooks = new ArrayList<Book>();
		
		for(Book b: allBooks) {
			
			if(b.isAvailable()) {
				availableBooks.add(b);
			}
		}
		
		return availableBooks;
		
		
	}
}
