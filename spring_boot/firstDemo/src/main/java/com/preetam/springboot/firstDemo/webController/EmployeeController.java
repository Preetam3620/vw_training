package com.preetam.springboot.firstDemo.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.preetam.springboot.firstDemo.dao.EmployeeDao;
import com.preetam.springboot.firstDemo.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao EmpDao;

	@GetMapping("getEmp/{EmpId}")
	public String getEmpDetails(@PathVariable int EmpId, ModelMap model) {
		Employee e = this.EmpDao.getEmployee(EmpId);

		System.out.println("here");

		if (e != null) {
			model.addAttribute("Employee", e);

		} else {
			model.addAttribute("message", "Employee not found, EmpId = " + EmpId);
		}
		return "employee";
	}
}