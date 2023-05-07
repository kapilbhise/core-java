package com.programming.class3;

public class Book implements Comparable<Book> {

	public int bookId;
	public String name;
	public String author;
	public String publisher;
	public double quantity;

	// constructor
	public Book (int bookId, String name, String author, String publisher, double quantity) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return (this.bookId-o.bookId);
	}

}
