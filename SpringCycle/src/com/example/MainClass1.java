package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass1 {
	public static void main(String[] args) {
		//1. Container 생성
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//3. Spring Container가 관리하는 bean 생성
		Student std = ctx.getBean("student3", Student.class);
		System.out.println(std);
		//4 Container 소멸: 객체도 같이 소멸된다.
		//즉 Spring Object의 lifeCycle은 Container와 같다.
		ctx.close();
		///////
		ctx = new AnnotationConfigApplicationContext(ApplicationConfig1.class);
		//3. Spring Container가 관리하는 bean 생성
		Student std1 = ctx.getBean("student4", Student.class);
		System.out.println(std1);
		//4 Container 소멸: 객체도 같이 소멸된다.
		//즉 Spring Object의 lifeCycle은 Container와 같다.
		ctx.close();
	}
}
