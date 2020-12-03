package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//1. Container 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//2. Container 설정
		ctx.load("classpath:ApplicationContext.xml");
		ctx.refresh(); //반드시 load 후 refresh
		//refresh는 두 번할 수 없다: 반드시 새로 만들고 다시 생성
		ctx.close();
		//다시 만들자
		ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ApplicationContext1.xml");
		ctx.refresh();
		//3. Spring Container가 관리하는 bean 생성
		Student std = ctx.getBean("student2", Student.class);
		System.out.println(std);
		//4 Container 소멸: 객체도 같이 소멸된다.
		//즉 Spring Object의 lifeCycle은 Container와 같다.
		ctx.close();
	}
}
