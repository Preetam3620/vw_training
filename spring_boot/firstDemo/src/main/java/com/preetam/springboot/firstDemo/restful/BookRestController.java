package com.preetam.springboot.firstDemo.restful;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.preetam.springboot.firstDemo.dao.BookDao;
import com.preetam.springboot.firstDemo.exceptions.BookNotFoundException;
import com.preetam.springboot.firstDemo.model.Book;

@RestController
public class BookRestController {

	@Autowired
	BookDao bookDao;

	@GetMapping("book/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		Book b = this.bookDao.getBook(bookId);
		if (b == null)
			throw new BookNotFoundException("Book with id:" + bookId + " not found");
		else
			return b;
	}

	@GetMapping("book1/{bookId}")
	public ResponseEntity<Book> getBook1(@PathVariable int bookId) {
		Book b = this.bookDao.getBook(bookId);
		if (b == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(b);

	}

	@PostMapping("addBook")
	public String addBook(@RequestBody Book b) {
		boolean r = this.bookDao.addBook(b);
		if (r) {
			return "Book with bookId: " + b.getBookId() + " added successfully";
		} else {
			return "Book not added, BookId: " + b.getBookId();
		}
	}

	@PostMapping("addBook1")
	public ResponseEntity<Book> addBook1(@RequestBody Book b) {
		boolean r = this.bookDao.addBook(b);
		if (!r) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/book/{id}")
				.buildAndExpand(b.getBookId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("allBooks")
	public List<Book> getAllBooks() {
		return this.bookDao.getAllBooks();
	}

	@DeleteMapping("removeBook")
	public String removeBook(@RequestBody Book b) {
		int bookId = this.bookDao.removeBook(b);
		if (bookId != -1) {
			return "Book with BookId = " + bookId + " deleted successfully";
		} else {
			return "-1";
		}
	}

	@DeleteMapping("removeBook/{bookId}")
	public String removeBookByID(@PathVariable int bookId) {
		int _bookId = this.bookDao.removeBook(bookId);
		if (_bookId != -1) {
			return "Book with BookId = " + _bookId + " deleted successfully";
		} else {
			return "-1";
		}
	}

	@DeleteMapping("removeBook1/{bookId}")
	public ResponseEntity<String> removeBookByID1(@PathVariable int bookId) {
		int _bookId = this.bookDao.removeBook(bookId);
		if (_bookId != -1) {
			return ResponseEntity.ok("Book removed with bookId: " + _bookId);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
