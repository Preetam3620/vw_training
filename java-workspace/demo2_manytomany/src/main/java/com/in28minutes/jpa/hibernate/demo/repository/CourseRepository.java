package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.jpa.hibernate.demo.entity.Course;


@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;

	public void insert(Course c) {
		em.persist(c);
	}

	public List<Course> retrieveCourse() {
		return em.createQuery("select c from Course c", Course.class).getResultList();
	}

}
