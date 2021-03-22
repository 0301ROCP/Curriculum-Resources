package com.example.presentation;

import java.util.List;

import com.example.models.Book;
import com.example.service.Service;

public class FrontEnd {
	
	
	
	public FrontEnd(Service service) {
		super();
		this.service = service;
	}

	private Service service;
	
	/*
	 * Greeting
	 * 
	 * Showing the books (only the available)
	 * 
	 * Letting them pick a book to withdraw!
	 */
	
	
	public void displayBooks() {
		
		List<Book> books = service.getAllBooks();
		
		System.out.println("Here are all the books that are available to be withdrawn!!");
		
		for(Book b: books) {
			System.out.println(b.getName());
		}
		
		
	}
	
	public void userWithdrawal() {
		
		/*
		 * withdrawal method here!
		 */
	}

}
