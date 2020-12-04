package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Calculator;
import com.example.StudentVO;
import com.example.config.AppConfig;

public class SungjukMgmtTest {
	private ApplicationContext ctx;
	private Calculator calc;
	
	@Before
	public void init() {
		this.ctx = new AnnotationConfigApplicationContext(AppConfig.class);
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
		
		assertEquals("한지민",std.getName());
		assertSame(std, std1);
	}
	
	@Test
	public void test1() {
		StudentVO std = ctx.getBean("younghee", StudentVO.class); //AppConfig.java에서 생성자 파라미터로 들어간건 younghee, chulsu는 계산이 안되있다. 
		assertEquals(89+100+77,std.getTot());
	}

}
