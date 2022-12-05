package com.namrata.springbootdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.namrata.springbootdemo2.model.Emp;

/*
 * @SpringBootApplication annotation indicates a configuration class that declares 
 * one or more @Bean methods and also triggers auto-configuration and component scanning.
 * This is a convenience annotation that is equivalent to declaring @Configuration, 
 * @EnableAutoConfiguration, and @ComponentScan.
 */
@SpringBootApplication
public class Springbootdemo2Application  {


	
	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo2Application.class, args);
	}
	
	  
	   
	 @Bean
	 Emp emp(@Value("${empno}")int empno,@Value("${ename}") String ename,@Value("${esal}") double sal)
	 {
		 return new Emp(empno,ename,sal);
	 }
	 
	

	

}


//https://www.appsdeveloperblog.com/reading-application-properties-spring-boot/#:~:text=Another%20very%20simple%20way%20to,will%20be%20assigned%20that%20value.
