package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Hello;
import com.example.Printer;
import com.example.StringPrinter;


public class HelloBeanJUnitTest {
	private ApplicationContext ctx;
	/*
	 *	@Before: Test 전에 해야할 일
	 *	@Test: Test
	 *	@Ignore: 해당 Annotation을 무시한다.
	 * */
	/*	Method
	 *	 - assertEquals(Object v1, Object v2): v1과 v2가 일치하는지 값 비교
	 *	 - assertSame(Object v1, Objectv2): v1과 v2가 일치하는지 주소 비교 
	 *
	 * */
	
	@Before //Annotation을 찾지 클래스 명이 중요하지 않다.
	public void init() {
		//1. Container 생성
		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
	}
	@Ignore @Test
	public void test1() {
		//2. Hello bean 가져오기
		Hello h = this.ctx.getBean("hello", Hello.class);
		assertEquals("Hello 한지민", h.sayHello()); //값 비교 메서브
	}
	@Ignore @Test
	public void test2() {
		Hello h = this.ctx.getBean("hello", Hello.class);
		h.print();
		Printer sPrinter = (Printer)this.ctx.getBean("sPrinter");
		assertEquals("Hello 한지민", sPrinter.toString());
	}
	@Test
	public void test3() {
		Hello h1 = (Hello)this.ctx.getBean("hello");
		Hello h2 = this.ctx.getBean("hello", Hello.class);
		assertSame(h1, h2); //주소 비교
	}
}
