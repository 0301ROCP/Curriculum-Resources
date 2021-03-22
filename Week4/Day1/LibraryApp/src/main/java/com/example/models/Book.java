package com.example.models;

public class Book {
	
	private int bookId;
	private String name;
	private String description;
	private String author;
	private String genre;
	private int pageCount; 
	private boolean available;
	private boolean overDue;
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", description=" + description + ", author=" + author
				+ ", genre=" + genre + ", pageCount=" + pageCount + ", available=" + available + ", overDue=" + overDue
				+ "]";
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(int bookId, String name, String description, String author, String genre, int pageCount,
			boolean available, boolean overDue) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.description = description;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
		this.available = available;
		this.overDue = overDue;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public boolean isOverDue() {
		return overDue;
	}
	public void setOverDue(boolean overDue) {
		this.overDue = overDue;
	}
	
	

}
