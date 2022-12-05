package com.in28minutes.jpa.hibernate.demo;
 
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;
 

//import com.in28minutes.jpa.hibernate.demo.entity.Employee;
//import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;
 

@SpringBootApplication
public class DemoApplicationStud implements CommandLineRunner {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 

    @Autowired
    private StudentRepository StudentRepository;
 
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
 
    @Override
    public void run(String... arg0) throws Exception {


        StudentRepository.insert(new Student("preetam"));

        logger.info("Student -> {}", 
                StudentRepository.retrieveStudent());


    }
}