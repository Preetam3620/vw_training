package com.in28minutes.jpa.hibernate.demo;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Course c1 = new Course(10L, "Java");
		Course c2 = new Course(20L, "Hibernate");
		Course c3 = new Course(30L, "Springboot");

		courseRepository.insert(c1);
		courseRepository.insert(c2);
		courseRepository.insert(c3);

		List<Course> courseL = new ArrayList<Course>();
		courseL.add(c1);
		courseL.add(c3);

		Student s1 = new Student(1L, "Ram");
		s1.setCourseList(courseL);
		studentRepository.insert(s1);

		Student s2 = new Student(2L, "Shyam");
		s2.getCourseList().add(c1);
		studentRepository.insert(s2);

		Student s3 = new Student(3L, "Preetam");
		s3.getCourseList().add(c2);
		studentRepository.insert(s3);
		Student s4 = new Student(4L, "Sandeep");
		s4.getCourseList().add(c2);
		studentRepository.insert(s4);
		/*
		 * Passport p = new Passport("1234", LocalDate.now());
		 * passportRepository.insert(p);
		 * 
		 * Passport p1 = new Passport("5678", LocalDate.of(2022, 11, 10));
		 * passportRepository.insert(p1);
		 * 
		 * Department d = new Department("HR"); Department d1 = new
		 * Department("Accounts");
		 * 
		 * departmentRepository.insert(d); departmentRepository.insert(d1);
		 * 
		 * employeeRepository.saveEmployeeWithPassportAndDepartment(p, d, p1);
		 * 
		 * System.out.println("List all Employees of given department:-");
		 * departmentRepository.listAllEmployees(3L);
		 * 
		 * System.out.println("List particular Employee's department:-");
		 * System.out.println(employeeRepository.findDepartmentOfEmployee(5L));
		 * 
		 * 
		 * Employee ex = employeeRepository.findById(1L);
		 * 
		 * 
		 * System.out.println("retrieve back after persisting:"+ex);
		 * 
		 * 
		 * ex.setSalary(9000);
		 * System.out.println("Changing employee with id 1 outside the transaction:"+ex)
		 * ;
		 * 
		 * employeeRepository.save(ex);
		 * 
		 * 
		 * logger.info("Employees -> {}", employeeRepository.retrieveEmployees());
		 * 
		 * 
		 * 
		 * employeeRepository.deleteById(2L);
		 * 
		 * 
		 * logger.info("Employees -> {}", employeeRepository.retrieveEmployees());
		 */
	}
}
