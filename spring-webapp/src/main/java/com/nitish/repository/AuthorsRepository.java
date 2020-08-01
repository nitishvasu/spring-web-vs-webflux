package com.nitish.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nitish.domain.Author;

@Repository
public class AuthorsRepository {

	private List<Author> authors;

	public AuthorsRepository() {
		authors = new ArrayList<>();
		authors.add(new Author(1, "Author-1"));
		authors.add(new Author(2, "Author-2"));
		authors.add(new Author(3, "Author-3"));
	}

	public Author getAuthor(Integer id) {
		for (Author author : authors) {
			if (author.getId().equals(id)) {
				return author;
			}
		}
		return null;
	}

}
