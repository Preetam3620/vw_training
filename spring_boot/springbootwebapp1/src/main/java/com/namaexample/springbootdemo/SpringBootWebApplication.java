

package com.namaexample.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

	
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(SpringBootWebApplication.class); }
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("spring boot demo app");
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
	
	

}
