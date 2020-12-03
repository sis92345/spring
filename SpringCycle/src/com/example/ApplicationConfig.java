package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
	@Bean
	public Student student3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("³¬½Ã");
		list.add("¹ÙµÏ");
		list.add("°ÔÀÓ");
		Student std = new Student("ÇÑÁö¹Î",28, list);
		std.setHeight(163.8);
		std.setWeight(56.2);
		return std;
	}
}
