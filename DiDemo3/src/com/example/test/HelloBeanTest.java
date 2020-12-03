package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;
import com.example.Printer;

public class HelloBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("config/annos.xml");
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.sayHello());
		hello.print();
		Printer printer = (Printer) context.getBean("printer");
		System.out.println(printer.toString());
		Hello hello2 = context.getBean("hello", Hello.class);
		hello2.print();
		System.out.println(hello == hello2);
	}
}
