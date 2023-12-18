package com.fdmgroup.BookShopTDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatalogTest {
	
	@BeforeEach
	void setUp() throws Exception{
		
	}
	@Test
	void testBeforeAdd() {
		// Arrange 
		Catalog c = new Catalog();
		
		//Act
		List<Book> bks = c.getAllBooks();
		
		//Assert
		assertEquals(bks.size(),0);
		
	}
	@Test
	void afterAdd() {
		Catalog c = new Catalog();
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		List<Book> bks = c.getAllBooks();
		c.addBook(b1);
		c.addBook(b2);
		
		assertEquals(bks.size(), 2);
	}
	

}
