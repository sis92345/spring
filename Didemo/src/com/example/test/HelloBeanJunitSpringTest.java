package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Hello;
import com.example.Printer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class HelloBeanJunitSpringTest {
	//JUnit을 Text FrameWork로 이용
	/* 상세 내용 검색해보기
	 *	1. @RunWith: 
	 *  2. @ContextConfiguration: 전체 환경 설정
	 *  3. @Autowired: 자동 바인딩 Annotation
	 * */
	@Autowired
	private ApplicationContext ctx;
//	@Before 이 작업이 자동으로 된거
//	public void init() {
//		//1. Container 생성
//		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
//	}
	@Test
	public void test1() {
		//2. Hello bean 가져오기
		Hello h = this.ctx.getBean("hello", Hello.class);
		assertEquals("Hello 한지민", h.sayHello()); //값 비교 메서브
	}
	@Test
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
