package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Calculator;
import com.example.StudentVO;

@Configuration
public class AppConfig {
	
	@Bean
	public StudentVO chulsu() {
		StudentVO std = new StudentVO();
		std.setHakbun("2020-01");
		std.setName("한지민");
		std.setKor(89);
		std.setEng(100);
		std.setMat(77);
		return std;
	}
	@Bean
	public StudentVO younghee() {
		StudentVO std = new StudentVO();
		std.setHakbun("2020-02");
		std.setName("김영희");
		std.setKor(89);
		std.setEng(100);
		std.setMat(77);
		return std;
	}
	@Bean
	public Calculator myCalculator() {
		Calculator cal = new Calculator();
		cal.setStudent(this.younghee());
		return cal;
	}
	
}
