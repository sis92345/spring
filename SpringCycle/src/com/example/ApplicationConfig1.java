package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig1 {
	@Bean
	public Student student4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���α׷���");
		list.add("�׸��׸���");
		list.add("��������");
		Student std = new Student("������",35, list);
		std.setHeight(165.8);
		std.setWeight(66.5);
		return std;
	}
}
