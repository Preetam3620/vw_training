package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Employee1;

@Repository
public interface EmployeeSpringDataJpaRepository extends JpaRepository<Employee1, Long>{
	
	List<Employee1> findByNameAndId(String name, Long id);
	
	List<Employee1> findByName(String name);
	
	List<Employee1> findBySalary(Double salary);
	
	List<Employee1> findByNameOrderByIdDesc(String name);
	
	@Transactional
	List<Employee1> deleteByName(String name);
	
	Long countByName(String name);
	
	@Query("Select e From Employee1 e where name like '%y%'")
	List<Employee1> employeeWithPatternInName();
	
	@Query(value = "Select * From Employee1 e where name like '%y%'", nativeQuery = true)
	List<Employee1> employeeWithPatternInNameUsingNativeQuery();

}
