package com.nitish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.domain.Response;
import com.nitish.repository.AuthorsRepository;
import com.nitish.repository.BooksRepository;

import reactor.core.publisher.Flux;

@Service
public class BooksService {

	@Autowired
	private AuthorsRepository authorsRepository;

	@Autowired
	private BooksRepository booksRepository;

	public Flux<Response> getAllBooks() {
		return booksRepository.getAllBooks().flatMap(book -> {
			sleep(1000);
			return authorsRepository.getAuthor(book.getAuthorId()).map(author -> new Response(book, author));
		});
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
