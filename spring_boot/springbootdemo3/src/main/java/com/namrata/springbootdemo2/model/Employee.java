package com.namrata.springbootdemo2.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${emp.empid}")
	private int empid;
	
	
	@Value("${emp.ename}")
	private String empname;
	
	@Value("${emp.esal}")
	private double salary;
	
	
	public Employee()
	{
		this.empid=1;
		this.empname="ram";
		this.salary=1000;
	}
	
	
	public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double computeAnnualSalary()
	{
		return this.salary*12;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
	
	
    
}
