package com.nitish.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nitish.domain.Book;

@Repository
public class BooksRepository {

	List<Book> books;

	public BooksRepository() {
		books = new ArrayList<>();
		books.add(new Book(1, "book1", 1));
		books.add(new Book(2, "book2", 1));
		books.add(new Book(3, "book3", 2));
		books.add(new Book(4, "book4", 3));
		books.add(new Book(5, "book5", 3));
	}

	public List<Book> getAllBooks() {
		return books;
	}
}
