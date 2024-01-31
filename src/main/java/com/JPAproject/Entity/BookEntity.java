package com.JPAproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookStore")
public class BookEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int serialNumber;
	private String bookName;
	private String author;
	
	public BookEntity(int serialNumber, String bookName, String author) {
		super();
		this.serialNumber = serialNumber;
		this.bookName = bookName;
		this.author = author;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Entity called");
	}
	@Override
	public String toString() {
		return "BookEntity [serialNumber=" + serialNumber + ", BookName=" + bookName + ", Author=" + author + "]";
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
