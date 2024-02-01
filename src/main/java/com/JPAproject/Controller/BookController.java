package com.JPAproject.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPAproject.Entity.BookEntity;
import com.JPAproject.Service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	@PostMapping("/addBook")
	public BookEntity addBook(@RequestBody BookEntity bookEntity) {
		BookEntity b=this.bookService.addBooks(bookEntity);
		return b;
	}
	
	@GetMapping("/getBooks")
	public List<BookEntity> fetchBooks()
	{
		return this.bookService.fetchBooks();
	}
	@GetMapping("/getBook/{id}")
	public BookEntity fetchBookById(@PathVariable int id) {
		return this.bookService.fetchBookById(id);
	}
	
	@PutMapping("/update/{id}")
	public BookEntity updateBook(@PathVariable int id, @RequestBody BookEntity entity) {
		//TODO: process PUT request
		System.out.println("method called");
		return this.bookService.updateBook(id,entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public BookEntity deleteBook(@PathVariable int id)
	{
		return this.bookService.deleteBook(id);
	}	
	

}
