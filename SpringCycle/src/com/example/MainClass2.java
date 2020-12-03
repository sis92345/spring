package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		//1. Container ���� �� ����
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		//2. Container �̿�
		Product p = ctx.getBean("product", Product.class);
		System.out.println(p);
		//3. Container �Ҹ�
		ctx.close();
	}
}
