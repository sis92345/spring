package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Hello;
import com.example.Printer;
import com.example.config.AppCtx;

public class HelloBeanTest {
	public static void main(String[] args) {
		//Annotation을 구현한 Config
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Hello h = (Hello)ctx.getBean("hello");
		System.out.println(h.sayHello());
		h.print();
		Printer sp = ctx.getBean("sPrinter", Printer.class);
		System.out.println(sp); //sp.toString()
		
	}
}
