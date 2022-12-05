package com.preetam.springboot.firstDemo.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.preetam.springboot.firstDemo.dao.BookDao;
import com.preetam.springboot.firstDemo.model.Book;

@Controller
public class BookController {

	@Autowired
	BookDao bookDao;
	
	@GetMapping("mybook/{bookId}")
	public String getBookDetails(@PathVariable int bookId, ModelMap model) {
		Book b = this.bookDao.getBook(bookId);
		
		System.out.println("here");

		if(b != null) {
			model.addAttribute("myBook", b);
			
		} else {
			model.addAttribute("message", "book not found, bookId = " + bookId); 
		}
		return "book";
	}
}
