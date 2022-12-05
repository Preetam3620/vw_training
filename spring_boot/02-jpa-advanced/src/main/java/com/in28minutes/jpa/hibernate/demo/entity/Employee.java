package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
@NamedQuery(name = "query_all_emps", query = "Select e from Employee e")
@NamedQuery(name = "query_emp_on_name", query = "select e from Employee e where e.name like '%y%'")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(name = "sal")
	private double salary;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "p_id")
	private Passport passport;

	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;
	
//	@ManyToMany(fetch = FetchType.LAZY)
//	private List<Course> = new ArrayList

	protected Employee() {
	}

	public Employee(String name, double salary, Passport passport) {
		this.name = name;
		this.salary = salary;
		this.passport = passport;
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		// this.passport=passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", passport=" + passport
				+ ", department=" + department + "]";
	}

}