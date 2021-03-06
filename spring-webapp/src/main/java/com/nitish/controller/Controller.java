package com.nitish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.domain.Response;
import com.nitish.service.BooksService;

@RestController
public class Controller {

	@Autowired
	private BooksService booksService;

	@GetMapping(value = "/allBooks", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public List<Response> getAllBooks() {
		return booksService.getAllBooks();
	}
}
