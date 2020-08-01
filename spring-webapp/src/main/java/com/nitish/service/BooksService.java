package com.nitish.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.domain.Author;
import com.nitish.domain.Book;
import com.nitish.domain.Response;
import com.nitish.repository.AuthorsRepository;
import com.nitish.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private AuthorsRepository authorsRepository;

	@Autowired
	private BooksRepository booksRepository;

	public List<Response> getAllBooks() {
		List<Response> response = new ArrayList<>();
		List<Book> books = booksRepository.getAllBooks();
		for (Book book : books) {
			Author author = authorsRepository.getAuthor(book.getAuthorId());
			response.add(new Response(book, author));
			sleep(1000);
		}
		return response;
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
