package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:Beans.xml");
		Hello1 hello = ctx.getBean("hello1", Hello1.class);
		System.out.println(hello.sayHello());
		hello.print();
		Printer printer = ctx.getBean("stringPrinter", StringPrinter.class);
		System.out.println(printer.toString());
		hello.getHobbys().forEach(value -> System.out.println(value));
	}
}
