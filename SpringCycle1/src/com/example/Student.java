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
	//Bean 초기화(refresh): InitializingBean
	//Bean 소멸(close): DisposableBean
	//재정의 필요
	private String name;
	private int age;
	private String gender;
	private String city;
	//@PostConstruct
	public void initMethod() {
		System.out.println("방금 Bean이 소멸되었습니다.");
	}
	//@PreDestroy
	public void destoryMethod() {
		System.out.println("방금 Bean이 생성되었습니다.");
	}
	//Container가 아닌 객체(bean)을 생성, 소멸할 때 작업하는 메소드
//	@Override
//	public void destroy() throws Exception { //close()
//		System.out.println("방금 Bean이 소멸되었습니다.");
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception { //refresh()
//		System.out.println("방금 Bean이 생성되었습니다.");
//		
//	}
}
