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
		student1.setName("���");
		student1.setAge(55);
		student1.setGender("����");
		student1.setCity("�뱸");
		System.out.println(student1);
		System.out.println("----------------------------------");
		if (student == student1) //�ּҺ�, �Ϲ� ��ü���� equals�� �ּҺ�, String�� �Ѱ� ����
			System.out.println("Equals"); // Print Equals
		else
			System.out.println("Different");
		context.close();
	}
}
