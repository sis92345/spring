package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;

class HelloBeanJUnit5Test {
	private ApplicationContext context;

	@BeforeEach
	public void init() {
		this.context = new GenericXmlApplicationContext("config/annos.xml");
	}

	@Test
	public void test1() {
		Hello hello = (Hello) context.getBean("hello");
		assertEquals("Hello วัม๖นฮ", hello.sayHello());
		hello.print();
	}

	@Test
	public void test2() {
		Hello hello = (Hello) context.getBean("hello");
		Hello hello2 = context.getBean("hello", Hello.class);
		assertSame(hello, hello2);
	}

}
