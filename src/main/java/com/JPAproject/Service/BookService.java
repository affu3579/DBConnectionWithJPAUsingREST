package com.JPAproject.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPAproject.Entity.BookEntity;
import com.JPAproject.Repositary.BookRepositary;

@Service
public class BookService {

	@Autowired
	private BookRepositary bookRepositary;
	
	public BookEntity addBooks(BookEntity b) {
		// TODO Auto-generated method stub
		
		BookEntity b1=bookRepositary.save(b);
		return b1;
		
	}

	public List<BookEntity> fetchBooks() {
		// TODO Auto-generated method stub
		return this.bookRepositary.findAll();
	}

	public BookEntity fetchBookById(int id) {
		// TODO Auto-generated method stub
		return this.bookRepositary.findById(id).orElse(null);
	}

	public BookEntity updateBook(int id, BookEntity entity) {
		System.out.println("method invoke");
		if(bookRepositary.existsById(id))
		{
			return this.bookRepositary.save(entity);
		}
		else
		{
			return entity;
		}
		// TODO Auto-generated method stub
		
	}

	public BookEntity deleteBook(int id) {
		// TODO Auto-generated method stub
		this.bookRepositary.deleteById(id);
		return null;
	}

	

	

	
}
