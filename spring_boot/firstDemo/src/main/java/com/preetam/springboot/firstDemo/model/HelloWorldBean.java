package com.preetam.springboot.firstDemo.model;

public class HelloWorldBean {

	private String message;
	private int numberOfUsers; 
	public HelloWorldBean(String msg, int no) {
		this.message = msg;
		this.numberOfUsers = no;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}
}
