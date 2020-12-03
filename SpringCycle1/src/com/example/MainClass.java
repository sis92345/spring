package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Spring Life Cycle: Container, Container�� �����ϴ� ��ü�� ���� �ʱ�ȭ, �Ҹ�
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:applicationContext.xml");
		context.refresh();	//Student afterPropertiesSet() ȣ��
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		context.close(); //Student destory() ȣ��
	}
}
