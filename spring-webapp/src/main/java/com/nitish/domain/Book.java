package com.nitish.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

	private Integer id;
	private String name;

	@JsonIgnore
	private Integer authorId;

}
