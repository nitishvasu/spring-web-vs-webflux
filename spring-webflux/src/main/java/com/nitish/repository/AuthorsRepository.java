package com.nitish.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nitish.domain.Author;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class AuthorsRepository {

	private List<Author> authors;

	public AuthorsRepository() {
		authors = new ArrayList<>();
		authors.add(new Author(1, "Author-1"));
		authors.add(new Author(2, "Author-2"));
		authors.add(new Author(3, "Author-3"));
	}

	public Mono<Author> getAuthor(Integer id) {
		return Flux.fromIterable(authors).filter(author -> author.getId().equals(id)).next();
	}

}
