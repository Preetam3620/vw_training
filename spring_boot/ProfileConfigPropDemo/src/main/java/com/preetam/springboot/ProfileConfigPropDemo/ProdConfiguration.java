package com.preetam.springboot.ProfileConfigPropDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.preetam.springboot.ProfileConfigPropDemo.model.Book;
import com.preetam.springboot.ProfileConfigPropDemo.model.Employee;

@Configuration
@Profile("prod")
public class ProdConfiguration {
	
	@Autowired
	AppConfigProp prop;
	
	@Bean("book")
	public Book getBook() {
		return new Book(prop.getBook().getBookId(), prop.getBook().getBookName(), prop.getBook().getAuthorName(),prop.getBook().getNoOfCopies());
	}
}
