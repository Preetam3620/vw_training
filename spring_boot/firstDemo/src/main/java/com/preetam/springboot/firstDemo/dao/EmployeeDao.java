package com.preetam.springboot.firstDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.preetam.springboot.firstDemo.model.Employee;

@Service
public class EmployeeDao {

	List<Employee> empArr;
	
	public EmployeeDao() {
		empArr = new ArrayList<Employee>();
		
		empArr.add(new Employee(2, "Preetam", 25000, 20));
		empArr.add(new Employee(4, "Alan", 15000, 80));
		empArr.add(new Employee(6, "Tony", 55000, 30));
	}
	
	public boolean addEmployee(Employee e) {
		this.empArr.add(e);
		return true;
	}
	
	public Employee getEmployee(int empId) {
		Employee emp = empArr.stream().filter((e) -> {
			return e.getEmpId() == empId;
		}).findFirst().orElse(null);
		return emp;
	}
	
	public int removeEmployee(Employee e) {
		boolean status = this.empArr.remove(e);
		if (status)
			return e.getEmpId();
		else 
			return -1;
	}
	
	public int removeEmployee(int empId) {
		boolean status = this.empArr.removeIf(b -> b.getEmpId() == empId);
		if (status)
			return empId;
		else 
			return -1;
	}
	
	public List<Employee> getAllEmployee() {
		return this.empArr;
	}
}
