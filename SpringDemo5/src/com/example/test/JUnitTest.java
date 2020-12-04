package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JUnitTest {
	// JUnit Jupiter
	ApplicationContext ctx;

	@BeforeEach
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
	}

	@Test
	public void test1() {
		assertNotNull(this.ctx);
	}

	@Test
	public void test2() {

	}
}
