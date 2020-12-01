package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MyCalculator mvc = (MyCalculator)ctx.getBean("myCalculator");
		MyCalculator mc1 = ctx.getBean("myCalculator", MyCalculator.class);
		
		mvc.add();
		mc1.div();
	}
}
