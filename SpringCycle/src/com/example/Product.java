package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component	//product id를 갖는 Component
@ToString
public class Product {
	@Value("노트북")
	private String name;
	@Value("25000000")
	private int price;
	@Value("삼성")
	private String maker;
	@Value("검은색")
	private String color;
}
