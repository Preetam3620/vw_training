package com.preetam.springboot.firstDemo.restful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.preetam.springboot.firstDemo.model.HelloWorldBean;

@RestController
public class GreetService {
	
	@Value("${name}")
	String myname;
	
	@GetMapping("greet")
	public String greetAll() {
		return "Hello!!";
	}
	
	@GetMapping("greetMessage/{msg}")
	public String greetMessage(@PathVariable String msg) {
		System.out.println("msg = " + msg +", "+ myname);
		return msg +", "+ myname;		
	}
	
	@GetMapping("greetParam")
	public String greetByName(@RequestParam String name) {
		return "Hi " + name; 
	}
	
	@GetMapping("greetMultiParams")
	public String greetByName2(@RequestParam String name, @RequestParam String surname) {
		return "Hi " + name + " " + surname;
	}
	
	@GetMapping("greetParam_Message/{name}")
	public String greet(@PathVariable String name, @RequestParam String surname) {
		return "Hi " + name + " " + surname;
	}
	
	@GetMapping("sayhi")
	public HelloWorldBean getMessage() {
		return new HelloWorldBean("Hi Folks!", 5);
	}
	
	@PostMapping("setHelloBean")
	public void setHelloBean(@RequestBody HelloWorldBean b) {
		System.out.println(b.getMessage());
		System.out.println(b.getNumberOfUsers());
	}
	
}
