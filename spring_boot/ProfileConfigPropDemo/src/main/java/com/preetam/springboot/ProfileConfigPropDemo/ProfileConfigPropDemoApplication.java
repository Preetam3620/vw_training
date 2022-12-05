package com.preetam.springboot.ProfileConfigPropDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.preetam.springboot.ProfileConfigPropDemo.model.Book;
import com.preetam.springboot.ProfileConfigPropDemo.model.Employee;
import com.preetam.springboot.ProfileConfigPropDemo.model.HelloWorld;

@SpringBootApplication
public class ProfileConfigPropDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProfileConfigPropDemoApplication.class, args);

		Employee e = (Employee) context.getBean("emp");
		System.out.println(e.getEmpName());
		System.out.println(e.getSalary());

		Book b = (Book) context.getBean("book");
		System.out.println(b.getBookId());
		System.out.println(b.getBookName());

		HelloWorld hw = (HelloWorld) context.getBean("hello");
		System.out.println(hw.getMessage());

	}

}
