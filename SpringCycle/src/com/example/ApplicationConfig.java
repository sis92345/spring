package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
	@Bean
	public Student student3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ٵ�");
		list.add("����");
		Student std = new Student("������",28, list);
		std.setHeight(163.8);
		std.setWeight(56.2);
		return std;
	}
}
