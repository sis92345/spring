package com.example.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.config.AppConfig1;
import com.example.config.AppConfig2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig1.class, AppConfig2.class})
public class ApplicationSpringTest {
	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void test() {
		assertNotNull(this.ctx);
	}
}
