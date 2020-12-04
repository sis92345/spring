package com.example.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Student;
import com.example.StudentInfo;

@Configuration
public class AppConfig1 {
	@Bean
	public Student student1() {
		//ArrayList<String> list = (ArrayList<String>)Arrays.asList("독서", "영화감상", "요리");
		ArrayList<String> list = new ArrayList<String>();
		list.add("독서");
		list.add("영화감상");
		list.add("요리");
		Student student1 = new Student("한지민", 25, list);
		student1.setHeight(165);
		student1.setWeight(45);
		return student1;
	}
	
//	@Bean
//	public Student student3() {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("노래부르기");
//		list.add("게임");
//		Student student3 = new Student("김지민", 50, list);
//		student3.setHeight(175);
//		student3.setWeight(75);
//		return student3;
//	}
	
	@Bean
	public StudentInfo studentInfo1() {
		StudentInfo studentInfo1 = new StudentInfo();
		studentInfo1.setStudent(this.student1());
		return studentInfo1;
	}
}
