package com.example.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Product;
import com.example.Student;

@Configuration
public class AppConfig2 {
	@Bean
	public Student student3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("노래부르기");
		list.add("게임");
		Student student3 = new Student("김지민", 50, list);
		student3.setHeight(175);
		student3.setWeight(75);
		return student3;
	}

	@Bean
	public Product product() {
		Product product = new Product("Computer", 2000000);
		product.setMaker("Samsung");
		product.setColor("Yellow");
		return product;
	}
}
