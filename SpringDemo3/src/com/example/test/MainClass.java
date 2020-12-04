package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Student;
import com.example.StudentInfo;
import com.example.config.AppConfig1;
import com.example.config.AppConfig2;

public class MainClass {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext(class<String>..componetClasses);
		//메소드 이름은 서로 달라야한다.
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig1.class, AppConfig2.class);
		Student jimin = ctx.getBean("student1",Student.class);
		StudentInfo info = ctx.getBean("studentInfo1",StudentInfo.class);
		System.out.println(jimin == info.getStudent());
	}
}
