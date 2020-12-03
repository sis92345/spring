package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Component("hello")
public class Hello {
	@Value("한지민")
	private String name;
	@Qualifier("stringPrinter") //Autowired는 type으로 구분, 그래서 타입이 같을 경우 이름으로 바인딩 해야하는데 이때 Resource 또는 Qulifier를 사용
	@Autowired
	private Printer printer;

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		this.printer.print(sayHello());
	}
}
