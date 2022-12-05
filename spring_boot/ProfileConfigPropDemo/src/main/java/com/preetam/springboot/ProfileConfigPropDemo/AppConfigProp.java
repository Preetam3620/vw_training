package com.preetam.springboot.ProfileConfigPropDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.preetam.springboot.ProfileConfigPropDemo.model.Employee;

@Component
@ConfigurationProperties("app")
public class AppConfigProp {
	private String message;
	private Employee emp;
	private Book book;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public static class Employee {
		private int empId;
		private String empName;
		private int salary;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
	}
	
	public static class Book {
		private String bookName;
		private int bookId;
		private String authorName;
		private int noOfCopies;
		
		public Book(int bookId, String bookName, String authorName, int noOfCopies) {
			super();
			this.bookName = bookName;
			this.bookId = bookId;
			this.authorName = authorName;
			this.noOfCopies = noOfCopies;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public int getNoOfCopies() {
			return noOfCopies;
		}

		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}

	}
}
