package com.example.samaras.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	@Lob
	private String description;
	private String imageUrl;
	private boolean myBooks;

	public Book() {
	}

	public Book(String title, String author, String description, String imageUrl) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.imageUrl = imageUrl;
		this.myBooks = false;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean getMyBooks() {
		return myBooks;
	}

	public void setMyBooks(boolean myBooks) {
		this.myBooks = myBooks;
	}

}
