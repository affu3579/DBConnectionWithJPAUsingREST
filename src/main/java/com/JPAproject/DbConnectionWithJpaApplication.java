package com.JPAproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JPAproject.Entity.BookEntity;
import com.JPAproject.Repositary.BookRepositary;

@SpringBootApplication
public class DbConnectionWithJpaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(DbConnectionWithJpaApplication.class, args);
//		applicationContext.getBean(BookRepositary.class);
	}

}
