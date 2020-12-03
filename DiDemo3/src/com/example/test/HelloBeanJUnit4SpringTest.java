package com.example.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("../config/annos.xml")
public class HelloBeanJUnit4SpringTest {
	@Autowired
	private ApplicationContext ctx;
	@Ignore @Test
	public void test() {
		assertNotNull(this.ctx);
	}
}
