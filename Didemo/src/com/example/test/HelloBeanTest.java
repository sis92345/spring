package com.example.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;
import com.example.Printer;

public class HelloBeanTest {
	public static void main(String[] args) {
		//1. Container 생성
		String path = "classpath:beans.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//2. Hello Beans 가져오기
		Hello h = (Hello)ctx.getBean("hello");
		//System.out.println(h.sayHello());
		h.print();// Hello Spring을 Buffer에 담는다.
		//3. SpringPrinter 가져오기
		Printer p = (Printer)ctx.getBean("sPrinter");
		System.out.println(p.toString());
		
		//Singleton pattern: 오직 객체는 하나
		Hello h1 = ctx.getBean("hello", Hello.class);
		if(h1 == h) {
			System.out.println("같은 객체이다."); //아이디가 같기 때문에 같은 객체이다. ★★★★★★
		}else {
			System.out.println("다른 객체이다.");
		}
		
		//4.Container 소멸
		ctx.close();
	}
}
