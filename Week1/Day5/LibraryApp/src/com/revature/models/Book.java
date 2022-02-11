package com.revature.models;

public class Book {
	
	private String bookName;
	private int pageNumber;
	private boolean available;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int pageNumber, boolean available) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.available = available;
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
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", pageNumber=" + pageNumber + ", available=" + available + "]";
	}
	
	
	

}
