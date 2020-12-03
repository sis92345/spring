package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.StudentInfo;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class ApplicationConfig {
	//Student�� Component�� �Ǿ ���⿡�� �ۼ� X
	@Bean
	public StudentInfo studentInfo() {
	return new StudentInfo();
	}
}
