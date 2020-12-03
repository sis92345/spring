package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:ApplicationConfig.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println("----------------------------------");
		Student student1 = context.getBean("student", Student.class);
		student1.setName("설운도");
		student1.setAge(55);
		student1.setGender("남성");
		student1.setCity("대구");
		System.out.println(student1);
		System.out.println("----------------------------------");
		if (student == student1) //주소비교, 일반 객체에서 equals는 주소비교, String은 둘가 가능
			System.out.println("Equals"); // Print Equals
		else
			System.out.println("Different");
		context.close();
	}
}
