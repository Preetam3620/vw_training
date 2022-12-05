package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	private Long studentId;

	@Column(nullable = false)
	private String studentName;

	@ManyToMany
	@JoinTable(name = "Student_Course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	List<Course> courseList = new ArrayList<Course>();;

	public Student() {
	}

	public Student(Long studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Long getId() {
		return studentId;
	}

	public String getName() {
		return studentName;
	}

	public void setName(String name) {
		this.studentName = name;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Student [id=" + studentId + ", name=" + studentName + ", courseList=" + courseList + "]";
	}

}
