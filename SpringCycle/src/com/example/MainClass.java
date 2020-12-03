package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//1. Container ����
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//2. Container ����
		ctx.load("classpath:ApplicationContext.xml");
		ctx.refresh(); //�ݵ�� load �� refresh
		//refresh�� �� ���� �� ����: �ݵ�� ���� ����� �ٽ� ����
		ctx.close();
		//�ٽ� ������
		ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ApplicationContext1.xml");
		ctx.refresh();
		//3. Spring Container�� �����ϴ� bean ����
		Student std = ctx.getBean("student2", Student.class);
		System.out.println(std);
		//4 Container �Ҹ�: ��ü�� ���� �Ҹ�ȴ�.
		//�� Spring Object�� lifeCycle�� Container�� ����.
		ctx.close();
	}
}
