package com.revature.models;

public class Book {
	
	private String bookName;
	private int pageNumber;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int pageNumber) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", pageNumber=" + pageNumber + "]";
	}


	
	
	

}
