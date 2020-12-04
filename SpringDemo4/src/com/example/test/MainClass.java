package com.example.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Student;

public class MainClass {
	public static void main(String[] args) {
		String configFile = "classpath:applicationContext.xml"; //Annotation Config File은 가져오지 않는다: XML에 붙였기 때문
		AbstractApplicationContext context = new GenericXmlApplicationContext(configFile);
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);
		Student student3 = context.getBean("student3", Student.class);
		System.out.println(student3);
		context.close(); //AbstractApplicationContext는 close를 할 수 있다.
	}
}