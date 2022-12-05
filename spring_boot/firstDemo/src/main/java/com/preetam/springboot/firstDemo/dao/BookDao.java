package com.preetam.springboot.firstDemo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.preetam.springboot.firstDemo.model.Book;

@Service
public class BookDao {

	List<Book> bookArr;

	public BookDao() {
		bookArr = new ArrayList<Book>();

		bookArr.add(new Book(1, "Restful WebServices", "xyz", 200));
		bookArr.add(new Book(2, "Spring Book", "abc", 100));
		bookArr.add(new Book(3, "Java", "zxc", 500));
	}

	public boolean addBook(Book b) {
		this.bookArr.add(b);
		return true;
	}

	public Book getBook(int bookId) {
		Book book = bookArr.stream().filter((b) -> {
			return b.getBookId() == bookId;
		}).findFirst().orElse(null);
		System.out.println(book);
		return book;
	}

	public Book getBook1(int bookId) {
		Optional<Book> book = bookArr.stream().filter((b) -> {
			return b.getBookId() == bookId;
		}).findFirst();

		if (book.isPresent())
			return book.get();
		else
			return null;
	}

	public Book getBook2(int bookId) {
		Iterator<Book> itr = bookArr.iterator();
		Book b1 = null;

		while (itr.hasNext()) {
			b1 = itr.next();
			if (b1.getBookId() == bookId) {
				return b1;
			}
		}
		return null;

	}

	public int removeBook(Book b) {
		boolean status = this.bookArr.remove(b);
		if (status)
			return b.getBookId();
		else
			return -1;
	}

	public int removeBook(int bookId) {
		boolean status = this.bookArr.removeIf(b -> b.getBookId() == bookId);
		if(status)
			return bookId;
		else
			return -1;
	}

	public List<Book> getAllBooks() {
		return this.bookArr;
	}

}
