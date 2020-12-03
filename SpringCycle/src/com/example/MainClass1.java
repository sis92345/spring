package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass1 {
	public static void main(String[] args) {
		//1. Container ����
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//3. Spring Container�� �����ϴ� bean ����
		Student std = ctx.getBean("student3", Student.class);
		System.out.println(std);
		//4 Container �Ҹ�: ��ü�� ���� �Ҹ�ȴ�.
		//�� Spring Object�� lifeCycle�� Container�� ����.
		ctx.close();
		///////
		ctx = new AnnotationConfigApplicationContext(ApplicationConfig1.class);
		//3. Spring Container�� �����ϴ� bean ����
		Student std1 = ctx.getBean("student4", Student.class);
		System.out.println(std1);
		//4 Container �Ҹ�: ��ü�� ���� �Ҹ�ȴ�.
		//�� Spring Object�� lifeCycle�� Container�� ����.
		ctx.close();
	}
}
