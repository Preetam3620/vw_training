package com.namaexample.springbootdemo.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.namaexample.springbootdemo.model.Todo;

@Service
public class TodoService {
	
	 private static List<Todo> todos = new ArrayList<Todo>();
	 
	 
	  static {
	        todos.add(new Todo("1","Learn Spring Boot","namrata"));
	        todos.add(new Todo("2","Learn Spring Microservices","namrata"));
	        todos.add(new Todo("3", "Learn JPA","namrata"));
	    }
	  
	   public List<Todo> retrieveTodos(String user) {
	        List<Todo> filteredTodos = new ArrayList<Todo>();
	        for (Todo todo : todos) {
	        	
	        System.out.println("inside TodoService:retreive todos:username:"
	                                   +todo.getUsername());
	        
	            if (todo.getUsername().equals(user)) {
	                filteredTodos.add(todo);
	            }
	        }
	        return filteredTodos;
	    }

	    public void addTodo(String id, String desc, String username) {
	        todos.add(new Todo(id,desc,username));
	    }

}
