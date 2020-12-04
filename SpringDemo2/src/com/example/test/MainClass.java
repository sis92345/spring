package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Product;
import com.example.Student;
import com.example.StudentInfo;

public class MainClass {
	public static void main(String[] args) {
		//여러개 XML을 사용할 경우 Path, Generic을 사용하여 여러개 path 여러개 받을 수 있다.
		//GenericXmlApplicationContext.GenericXmlApplicationContext(String..resourceLocations)
		//이때 bean id는 중복되면 안된다.
		String path1 = "classpath:applicationContext.xml";
		String path2 = "classpath:applicationContext1.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path1, path2);
		Student jimin1 = ctx.getBean("student1",Student.class);
		Student jimin2 = ctx.getBean("student2",Student.class);
		StudentInfo si = ctx.getBean("studentInfo1", StudentInfo.class);
		Product p = ctx.getBean("product",Product.class);
		if(jimin1 == si.getStudent()) {
			System.out.println("같은 학생이다");
		}else System.out.println("다른 학생이다");
		
		System.out.println(jimin1);
		System.out.println("--------------------");
		System.out.println(jimin2);
		System.out.println("--------------------");
		System.out.println(p);
	}
}
