package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component	//product id�� ���� Component
@ToString
public class Product {
	@Value("��Ʈ��")
	private String name;
	@Value("25000000")
	private int price;
	@Value("�Ｚ")
	private String maker;
	@Value("������")
	private String color;
}
