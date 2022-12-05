package com.namaexample.springbootdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.namaexample.springbootdemo.model.Todo;
import com.namaexample.springbootdemo.service.TodoService;

@SessionAttributes("username")
@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	
	@GetMapping("/add-todo")
	public String addTodo()
	{
		
		return "add-todo";
		
	}
	
	@PostMapping("/todo")
	public String addTodo(@RequestParam String id,
			@RequestParam String description,ModelMap model)
	{
		
		System.out.println("inside add todo:username="+ (String)model.get("username"));
		service.addTodo(id,description,(String)model.get("username")); 
			return "redirect:/list-todos";
		 
		
	}
	
	@GetMapping("/list-todos")
	public String showTodos(ModelMap model){
		String name = (String) model.get("username");
		
		System.out.println("inside list todos:username="+ name);
		
		List<Todo> lst = service.retrieveTodos(name);
		model.put("todos",lst );
		return "todos-list";
	} 
	
	
	
	

}
