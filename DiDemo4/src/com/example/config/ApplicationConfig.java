package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.StudentInfo;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class ApplicationConfig {
	//Student는 Component가 되어서 여기에서 작성 X
	@Bean
	public StudentInfo studentInfo() {
	return new StudentInfo();
	}
}
