package com.example;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		//생성: ConfigurableApplicationContext
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		//1. ctx.getEnvironment(); 해당 Container의 환경을 불러온다
		ConfigurableEnvironment env = ctx.getEnvironment();
		//2. env.getPropertySources(); 해당 Contatiner에서 만들어진 env에서 MutablePropertySources를 생성
		//즉 현제 Environment에서 모든 Properties 파일을 가져온다.
		MutablePropertySources propertySouces = env.getPropertySources();
		// 내가 원하는 정보를 얻을 때까지 모든 propertySources를 앞에서 부터 차례로 모두 검색함.
		try {
			propertySouces.addLast(new ResourcePropertySource("classpath:admin.properties")); // property 추가
			System.out.println("--여기능 정상적으로 호출되었나 확인차 찍은 것--");
			System.out.println(env.getProperty("admin.id")); // property 추출
			System.out.println(env.getProperty("admin.pwd"));
		} catch (IOException ex) {
		}
		System.out.println("--여기부터 호출된 순서에 주의--");
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("classpath:beans.xml");
		//2.called afterPropertiesSet()
		gCtx.refresh();
		admin adminConnection = gCtx.getBean("adminConnection", admin.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("admin PWD : " + adminConnection.getAdminPwd());
		gCtx.close();
		ctx.close();
	}
}
