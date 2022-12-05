package com.namrata.springbootdemo2.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Emp {
	
	

	int empno;
	

	String ename;
	
	
	double salary;
	
	
	public Emp()
	{
		
	}

	public Emp(int empno, String ename, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	
		}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary +  "]";
	}
	
	
	

}
