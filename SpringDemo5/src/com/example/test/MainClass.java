package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Student;
import com.example.config.ApplicationConfig;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class); //Annotation File에 xml을 붙인다.
		Student jimin1 = ctx.getBean("student1",Student.class);
		Student jimin2 = ctx.getBean("student3",Student.class); //student3는 xml에서 선언되었지만 xml을 Annotation File에 붙였기 때문에 사용가능
		System.out.println(jimin1);
		System.out.println(jimin2);
	}
}