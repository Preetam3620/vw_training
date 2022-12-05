package com.in28minutes.jpa.hibernate.demo;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Department;
import com.in28minutes.jpa.hibernate.demo.entity.Employee;
import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.repository.DepartmentRepository;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;
import com.in28minutes.jpa.hibernate.demo.repository.PassportRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PassportRepository passportRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Passport p = new Passport("1234", LocalDate.now());
		passportRepository.insert(p);

		Passport p1 = new Passport("5678", LocalDate.of(2022, 11, 10));
		passportRepository.insert(p1);

		Department d = new Department("HR");
		Department d1 = new Department("Accounts");

		departmentRepository.insert(d);
		departmentRepository.insert(d1);

		employeeRepository.saveEmployeeWithPassportAndDepartment(p, d, p1);

		System.out.println("List all Employees of given department:-");
		departmentRepository.listAllEmployees(3L);

		System.out.println("List particular Employee's department:-");
		System.out.println(employeeRepository.findDepartmentOfEmployee(5L));

		logger.info("Employee that contains letter y in its name",
				employeeRepository.retrieveEmployeesUsingNamedQuery());

		logger.info("Employee that contains letter y in its name",
				employeeRepository.retrieveEmployeesUsingNamedQuery1());

		/*
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
