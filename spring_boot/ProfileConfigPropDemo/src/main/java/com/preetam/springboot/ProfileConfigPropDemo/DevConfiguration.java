package com.preetam.springboot.ProfileConfigPropDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.preetam.springboot.ProfileConfigPropDemo.model.HelloWorld;

@Configuration
@Profile("dev")
public class DevConfiguration {

	@Autowired
	AppConfigProp prop;
	
	@Bean("hello")
	public HelloWorld getHello() {
//		return new HelloWorld("Hi everyone!");
		return new HelloWorld(prop.getMessage());
	}
}
