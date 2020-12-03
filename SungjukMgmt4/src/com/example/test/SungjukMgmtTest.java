package com.example.test;





import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Calculator;
import com.example.StudentVO;
import com.example.config.AppConfig;

public class SungjukMgmtTest {
	private ApplicationContext ctx;
	private Calculator myCalculater;
	
	@BeforeEach
	public void init() {
		this.ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentVO std = this.ctx.getBean("student",StudentVO.class);
		System.out.println(std);
		
	}
	
	@Test
	public void test() {
		assertNotNull(this.ctx);
		
	}
	
	@Test
	public void test1() {
		StudentVO std = this.ctx.getBean("student",StudentVO.class);
		Calculator cal = this.ctx.getBean("calculator", Calculator.class);
		cal.calcTot();
		cal.calcAvg();
		cal.calcGrade();
		assertEquals(100+84+76, std.getTot());
	}

}
