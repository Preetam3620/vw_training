package com.preetam.springboot.ProfileConfigPropDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.preetam.springboot.ProfileConfigPropDemo.model.Employee;

@Configuration
public class DefaultConfiguration {
	
	@Autowired
	AppConfigProp prop;
	
	@Bean("emp")
	public Employee getEmp() {
		return new Employee(prop.getEmp().getEmpId(), prop.getEmp().getEmpName(), prop.getEmp().getSalary());
//		return new Employee(1, "Preetam", 10000);
	}
}
