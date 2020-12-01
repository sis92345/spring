package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ConsolePrinter;
import com.example.Hello;
import com.example.StringPrinter;

@Configuration // 이제 이 클래스가 xml
public class AppCtx {
	@Bean
	public Hello hello() { 
		Hello hello = new Hello();
		hello.setName("Spring");
		hello.setPrinter(this.sPrinter());
		return hello;
	}

	@Bean
	public StringPrinter sPrinter() {
		return new StringPrinter();
	}

	@Bean
	public ConsolePrinter consolePrinter() {
		return new ConsolePrinter();
	}
}