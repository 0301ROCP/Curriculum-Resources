package com.example.repo;

import java.util.List;

import com.example.models.Book;

public interface BookDao {
	
	//CRUD
	
	boolean insertBook(Book b);
	
	boolean deleteBook(Book b);
	
	boolean updateAvailablity(Book b,boolean status);
	boolean updateOverdue(Book b, boolean status);
	
	Book selectBookById(int id);
	Book selectBookByName(String name);
	List<Book> selectAllBooks();

}
