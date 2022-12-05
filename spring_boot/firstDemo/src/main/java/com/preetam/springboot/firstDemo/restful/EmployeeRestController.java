package com.preetam.springboot.firstDemo.restful;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.preetam.springboot.firstDemo.dao.EmployeeDao;
import com.preetam.springboot.firstDemo.exceptions.EmployeeNotFoundException;
import com.preetam.springboot.firstDemo.model.Employee;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeDao empDao;

	@GetMapping("emp/{empId}")
	public Employee getEmp(@PathVariable int empId) {
		Employee e = this.empDao.getEmployee(empId);
		if (e == null) {
			throw new EmployeeNotFoundException("Employee with id: " + empId + " not found");
		} else {
			return e;
		}
	}

	@GetMapping("emp1/{empId}")
	public ResponseEntity<Employee> getEmp1(@PathVariable int empId) {
		Employee e = this.empDao.getEmployee(empId);
		if (e == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(e);
	}

	@PostMapping("addEmp")
	public String addEmp(@RequestBody Employee e) {
		boolean status = this.empDao.addEmployee(e);
		if (status) {
			return "Employee with EmpId: " + e.getEmpId() + " added successfully";
		} else {
			return "Employee not added, EmpId: " + e.getEmpId();
		}
	}

	@PostMapping("addEmp1")
	public ResponseEntity<Employee> addEmp1(@RequestBody Employee e) {
		boolean status = this.empDao.addEmployee(e);
		if (!status) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/Emp/{id}")
				.buildAndExpand(e.getEmpId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("allEmp")
	public List<Employee> getAllEmp() {
		return this.empDao.getAllEmployee();
	}

	@DeleteMapping("removeEmp")
	public String removeEmp(@RequestBody Employee e) {
		int EmpId = this.empDao.removeEmployee(e);
		if (EmpId != -1) {
			return "Employee with EmpId = " + EmpId + " deleted successfully";
		} else {
			return "-1";
		}
	}

	@DeleteMapping("removeEmp/{empId}")
	public String removeEmp1(@PathVariable int empId) {
		int _EmpId = this.empDao.removeEmployee(empId);
		if (_EmpId != -1) {
			return "Emp with EmpId = " + _EmpId + " deleted successfully";
		} else {
			return "-1";
		}
	}
	
	@DeleteMapping("removeEmp1/{empId}")
	public ResponseEntity<String> removeBookByID1(@PathVariable int empId) {
		int _empId = this.empDao.removeEmployee(empId);
		if (_empId != -1) {
			return ResponseEntity.ok("Employee removed with empId: " + empId);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
