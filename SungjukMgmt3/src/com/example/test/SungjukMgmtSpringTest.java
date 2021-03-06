package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Calculator;
import com.example.StudentVO;
import com.example.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SungjukMgmtSpringTest {
	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void test() {
		Calculator myCalc = ctx.getBean("myCalculator", Calculator.class);
		StudentVO std = ctx.getBean("younghee", StudentVO.class);
		myCalc.calcTot();
		myCalc.calcAvg();
		myCalc.calcGrade();
		assertNotNull(std);
		assertEquals("B", String.valueOf(std.getGrade()));
		
	}
}
