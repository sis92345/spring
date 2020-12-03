package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig1 {
	@Bean
	public Student student4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("프로그래밍");
		list.add("그림그리기");
		list.add("게임제작");
		Student std = new Student("김지민",35, list);
		std.setHeight(165.8);
		std.setWeight(66.5);
		return std;
	}
}
