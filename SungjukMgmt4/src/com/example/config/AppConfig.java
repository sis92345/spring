package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Calculator;

@ComponentScan(basePackages = {"com.example"})
@Configuration
public class AppConfig {
	//Student는 @Component를 붙인 클래스를 자동으로 Bean으로 등록해주는 
	//@ComponentScan(basePackages = {"com.example"})를 이용해서 자동으로 등록
//	@Bean
//	public Calculator myCalculator() {
//		Calculator cal = new Calculator();
//		return cal;
//	}
}
