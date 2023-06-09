package com.wiley.SpringCore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.wiley.SpringCore.config.Student;
@Configuration
@ComponentScan(basePackages = "com.wiley.SpringCore.config")
public class SpringConfig {
	
	@Bean(name= {"st1"})
	public Student getStudent() {
		return new Student("kdb");
	}

}
