package com.javatechie.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Book")
public class Book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	public Book(String bookName,String authorName, int id) {
		this.bookName=bookName;
		this.authorName=authorName;
		this.id=id;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
