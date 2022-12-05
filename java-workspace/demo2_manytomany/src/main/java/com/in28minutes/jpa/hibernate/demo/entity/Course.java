package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	private Long courseId;

	@Column(nullable = false)
	private String courseName;

	@ManyToMany(mappedBy = "courseList")
	List<Student> studentList = new ArrayList<Student>();

	public Course() {
	}

	public Course(Long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Long getId() {
		return courseId;
	}

	public String getName() {
		return courseName;
	}

	public void setName(String name) {
		this.courseName = name;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Course [id=" + courseId + ", name=" + courseName + ", studentList=" + studentList + "]";
	}

}
