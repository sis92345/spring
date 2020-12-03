package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student{
	//Bean �ʱ�ȭ(refresh): InitializingBean
	//Bean �Ҹ�(close): DisposableBean
	//������ �ʿ�
	private String name;
	private int age;
	private String gender;
	private String city;
	//@PostConstruct
	public void initMethod() {
		System.out.println("��� Bean�� �Ҹ�Ǿ����ϴ�.");
	}
	//@PreDestroy
	public void destoryMethod() {
		System.out.println("��� Bean�� �����Ǿ����ϴ�.");
	}
	//Container�� �ƴ� ��ü(bean)�� ����, �Ҹ��� �� �۾��ϴ� �޼ҵ�
//	@Override
//	public void destroy() throws Exception { //close()
//		System.out.println("��� Bean�� �Ҹ�Ǿ����ϴ�.");
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception { //refresh()
//		System.out.println("��� Bean�� �����Ǿ����ϴ�.");
//		
//	}
}
