package com.preetam.springboot.firstDemo.model;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private int deptNo;
	
	public Employee() {
		System.out.println("Employee bean created");
	}
	
	public Employee(int empId, String empName, double salary, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpid(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empName;
	}
	public void setEmpname(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptNo;
	}
	public void setDeptno(int deptNo) {
		this.deptNo = deptNo;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptNo=" + deptNo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return ((Employee)obj).empId == this.empId;
	}
	
	
}
