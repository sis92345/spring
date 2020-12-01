package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Hello;
import com.example.Printer;
import com.example.StringPrinter;
import com.example.config.AppCtx;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppCtx.class})
public class HelloBeanJUnitSpringTest {
	
	@Autowired
	private ApplicationContext ctx;
//	JUnit Not Using Test Context
//	@Before
//	public void init() {
//		this.ctx = new AnnotationConfigApplicationContext(AppCtx.class);
//	}
	@Test
	public void test() {
		Hello h = (Hello)this.ctx.getBean("hello");
		assertEquals("Hello Spring", h.sayHello());
	}
	@Test
	public void test1() {
		Hello h1 = this.ctx.getBean("hello", Hello.class);
		h1.print();
		Printer pr = this.ctx.getBean("sPrinter", StringPrinter.class);
		assertEquals("Hello Spring", pr.toString());
	}
	@Test
	public void test2() {
		Printer pr = this.ctx.getBean("sPrinter", StringPrinter.class);
		Printer pr1 = (StringPrinter)this.ctx.getBean("sPrinter");
		assertSame(pr, pr1); //Singleton Pattern
	}
	

}

