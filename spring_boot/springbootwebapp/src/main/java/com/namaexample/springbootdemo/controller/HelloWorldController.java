package com.namaexample.springbootdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.namaexample.springbootdemo.model.Student;

@Controller
public class HelloWorldController {
	
	@Autowired
	Student s;
	
	 // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String greet(ModelMap model) {
        model.addAttribute("message", message);
        
        System.out.println("inside greet method");
      
        return "welcome"; //view
    }

    
	@GetMapping("/getstudent")
	public String getStudentDetails(ModelMap model)
	{
		  model.addAttribute("student",s);
          return "student";
		
	}
	
	
	 // /hello?name=kotlin
    @GetMapping("/hello")
    public String greetwithname(
            @RequestParam(name = "name", required = false, defaultValue = "namrata") 
			String name, ModelMap model) {

        model.addAttribute("message", name);

        return "welcome"; //view
    }
	

}
