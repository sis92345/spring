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
	@Value("������")
	private String name;
	@Qualifier("stringPrinter") //Autowired�� type���� ����, �׷��� Ÿ���� ���� ��� �̸����� ���ε� �ؾ��ϴµ� �̶� Resource �Ǵ� Qulifier�� ���
	@Autowired
	private Printer printer;

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		this.printer.print(sayHello());
	}
}
