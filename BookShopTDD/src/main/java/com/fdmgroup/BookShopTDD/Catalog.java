package com.fdmgroup.BookShopTDD;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	
	ArrayList <Book> books = new ArrayList<Book>();
	public List<Book> getAllBooks(){
		return this.books;
	}
	
	public void addBook(Book b1) {
		books.add(b1);
	}

}
