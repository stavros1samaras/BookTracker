package com.example.samaras.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samaras.Models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	List<Book> findByTitle(String title);

	//edw briskei apo ton pinaka book tis eggrafes me pedio MyBooks=True
	List<Book> findByMyBooksTrue();
}
