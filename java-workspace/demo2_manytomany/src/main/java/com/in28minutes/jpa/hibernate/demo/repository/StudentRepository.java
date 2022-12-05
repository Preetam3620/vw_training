package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

// Change from javax to jakarta
import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.demo.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public void insert(Student stud) {
		em.persist(stud);
	}

	public List<Student> retrieveStudent() {
		return em.createQuery("select s from Student s", Student.class).getResultList();
	}

}