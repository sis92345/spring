package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Calculator;
import com.example.StudentVO;

public class SungjukMgmtTest {
	private ApplicationContext ctx;
	private Calculator calc;
	
	@Before
	public void init() {
		ctx = new GenericXmlApplicationContext("classpath:beans.xml");
		calc = ctx.getBean("myCalculator", Calculator.class);
		calc.calcTot();
		calc.calcAvg();
		calc.calcGrade();
	}
	
	@Test
	public void test() {
		StudentVO std = ctx.getBean("chulsu", StudentVO.class);
		StudentVO std1 = ctx.getBean("chulsu", StudentVO.class);
		//StudentVO std12 = ctx.getBean("younghee", StudentVO.class);
		
		assertEquals("김철수",std.getName());
		assertSame(std, std1);
	}
	
	@Test
	public void test1() {
		StudentVO std = ctx.getBean("chulsu", StudentVO.class);
		assertEquals(89+90+77,std.getTot());
	}

}
