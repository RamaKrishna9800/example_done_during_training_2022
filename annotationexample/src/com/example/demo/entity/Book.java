package com.example.demo.entity;

import com.example.demo.annotation.MyColumn;
import com.example.demo.annotation.MyTable;

@MyTable(name = "book")

public class Book {
	@MyColumn(name = "booknumber")
	private int bookNumber;

	public Book(int bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

}
