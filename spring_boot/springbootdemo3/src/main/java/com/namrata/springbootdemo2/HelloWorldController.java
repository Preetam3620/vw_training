package com.namrata.springbootdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.namrata.springbootdemo2.model.Emp;

@RestController
public class HelloWorldController {
	
	@Autowired
	Emp e;
	
	@RequestMapping("/greetall")
	public String hello()
	{
		return "Hello All!";
	}


	@GetMapping("/greet")
	public String hello(@RequestParam String name)
	{
		return "Hello "+name+" !";
	}
	
	@GetMapping("/sum/{no1}/{no2}")
	public int sum(@PathVariable int no1,@PathVariable int no2)
	{
		return no1+no2;
	}
	
	@GetMapping("/getemp")
	public String getStudentDetails()
	{
		return e.getEmpno()+","+e.getEname()+","+e.getSalary();
	}
	

}
