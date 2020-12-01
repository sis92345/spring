package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Hello;
import com.example.config.AppCtx;

public class HelloBeanJUitTest {
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new AnnotationConfigApplicationContext(AppCtx.class);
	}
	@Test
	public void test() {
		Hello h = (Hello)this.ctx.getBean("hello");
		assertEquals("Hello Spring", h.sayHello());
	}

}
