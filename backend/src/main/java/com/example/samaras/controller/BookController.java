package com.example.samaras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samaras.Models.Book;
import com.example.samaras.Services.BookService;


import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {
	
	@Autowired
    BookService bookService;
	
	@GetMapping("/all")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}	
	
	@GetMapping("/myBooks")
	public List<Book> getMyBooks()
	{
		return bookService.getFavoriteBooks();
	}	

	@PostMapping("/addToFav")
	public void addToFav(@RequestBody Book book) {
		System.out.println("received book: " + book);
	    System.out.println("ID received: " + book.getId());
	    bookService.addToFav(book.getId());
	}	
}
