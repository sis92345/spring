package com.example.test;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"../../../config/annos.xml"})
public class HelloBeanJUnit5SpringTest {
	@Autowired
	private ApplicationContext ctx;
	@Test
	public void test() {
		assertNotNull(this.ctx); //import static org.junit.jupiter.api.Assertions.assertNotNull;
		
	}
	
}
