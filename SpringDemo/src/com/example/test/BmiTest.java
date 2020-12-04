package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.MyInfo;

public class BmiTest {
	private ApplicationContext ctx;
	@Before
	public void init() {
		String path = "classpath:ApplicationContext.xml";
		this.ctx = new GenericXmlApplicationContext(path);
	}
	@Test
	public void test1() {
		assertNotNull(this.ctx);
	}
	@Test
	public void test2() {
		MyInfo mi = this.ctx.getBean("myInfo",MyInfo.class);
		assertEquals("한지민", mi.getName());
		mi.bmiCalcu();
	}

}
