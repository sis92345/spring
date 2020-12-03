package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;
import com.example.Printer;

public class HelloJunit4Test {
	private ApplicationContext ctx;
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("config/annos.xml");
	}
	@Ignore @Test
	public void test() {
		assertNotNull(this.ctx);
	}
	@Ignore @Test
	public void test1(){
		Hello h = (Hello)this.ctx.getBean("hello");
		assertEquals("Hello 한지민", h.sayHello());
		h.print(); //StringPrinter의 sayHello()를 StringPrinter의 Buffer에 저장
		Printer p = (Printer)this.ctx.getBean("stringPrinter");
		assertEquals("Hello 한지민", p.toString());
	}
	@Test
	public void test2(){
		Hello h1 = (Hello)this.ctx.getBean("hello");
		Hello h2 = this.ctx.getBean("hello", Hello.class);
		assertSame(h1, h2); //Singleton이라 같은 객체
	}

}
