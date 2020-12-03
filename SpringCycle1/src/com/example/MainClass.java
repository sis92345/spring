package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Spring Life Cycle: Container, Container가 관리하는 객체도 같이 초기화, 소멸
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:applicationContext.xml");
		context.refresh();	//Student afterPropertiesSet() 호출
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		context.close(); //Student destory() 호출
	}
}
