package com.example.samaras.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samaras.Models.Book;
import com.example.samaras.Repos.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public ArrayList<Book> getAllBooks()
	{
		return (ArrayList<Book>) bookRepository.findAll();
	}

	public List<Book> getFavoriteBooks() {
		return bookRepository.findByMyBooksTrue();
	}
	
	public void addToFav(int id) {
	    Book book = bookRepository.findById(id).get();
	    System.out.println("Rrceived id from frntend: " + book.getId());
	    book.setMyBooks(true); // edw vriskw to vivlio kai allazw to pedio se true
	    bookRepository.save(book); 
	}

}
