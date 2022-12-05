package com.namrata.springbootdemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.namrata.springbootdemo2.model.Employee;



@RestController
public class EmpController {
	
	
	@Autowired
	Employee e;
	
	@GetMapping("/hello")
	public String sayhello()
	{
		return "Hi All, this is spring boot webservice demo";
	}
	
	@GetMapping("/greetbyname")
	public String sayhellobyname(@RequestParam String name,
			@RequestParam String surname )
	{
		return "Hi "+name+" "+surname;
	}
	
	
	@GetMapping("/getempannsal")
	public double getEmpAnnSal()
	{
		return e.computeAnnualSalary();
	}
	
	@GetMapping("/getempdetails")
	public String getEmpDetails()
	{
		return e.toString();
	}
	
	@GetMapping("/getemp")
	public Employee getEmp()
	{
		return e;
	}
	
	
	@PostMapping("/sum")
	public int sumtwonos(@RequestParam int no1,@RequestParam int no2)
	{
		return no1+no2;
	}
	
	
	@PostMapping("/postemp")
	public String postemployee(@RequestBody Employee e)
	{
		return e.getEmpname();
	}
	
	@PostMapping("/recvannsal")
	public double getempannsal(@RequestBody Employee e)
	{
		return e.computeAnnualSalary();
	}
	

}
