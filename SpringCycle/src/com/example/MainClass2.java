package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		//1. Container 생성 및 설정
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		//2. Container 이용
		Product p = ctx.getBean("product", Product.class);
		System.out.println(p);
		//3. Container 소멸
		ctx.close();
	}
}
