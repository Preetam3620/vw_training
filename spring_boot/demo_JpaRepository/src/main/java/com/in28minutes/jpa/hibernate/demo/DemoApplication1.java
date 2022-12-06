package com.in28minutes.jpa.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Employee1;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeSpringDataJpaRepository;

@SpringBootApplication
public class DemoApplication1 implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeSpringDataJpaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Employee1 e = new Employee1("Preetam", 7000);
		repo.save(e);
		e = new Employee1("Preetam", 5000);
		repo.save(e);
		e = new Employee1("Aniket", 2000);
		repo.save(e);
		e = new Employee1("Sandeep", 8000);
		repo.save(e);
		e = new Employee1("Vaibhav", 3000);
		repo.save(e);
		e = new Employee1("Piyush", 1000);
		repo.save(e);

		System.out.println(repo.findById(1L));
		System.out.println(repo.findByNameAndId("Preetam", 2L));
		System.out.println(repo.findByName("Sandeep"));
		System.out.println(repo.findByNameOrderByIdDesc("Preetam"));
		System.out.println(repo.deleteByName("Aniket"));
		System.out.println(repo.countByName("Preetam"));
		System.out.println(repo.employeeWithPatternInName());
		System.out.println(repo.employeeWithPatternInNameUsingNativeQuery());
		System.out.println(repo.findBySalary(7000.0));
		
		logger.info("Employee total count -> {}", repo.count());

	}
}
