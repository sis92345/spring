package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import lombok.Getter;
import lombok.Setter;

public class admin implements EnvironmentAware, InitializingBean, DisposableBean {
	//재정의 메소드
	//InitializingBean: afterPropertiesSet(): Bean 초기화
	//DisposableBean: destroy(): Bean 소멸
	//EnvironmentAware: setEnvironment(Environment env) 
	@Setter
	private Environment env;
	@Getter
	@Setter
	private String adminId;
	@Getter
	@Setter
	private String adminPwd;

	@Override
	public void destroy() throws Exception {
		System.out.println("called destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("called afterPropertiesSet()");
		System.out.println(" - - - gCtx.refresh();에서 세팅됩니다.");
		//admin 객체가 초기화될 때 해당 프로퍼티 세팅
		setAdminId(env.getProperty("admin.id"));
		setAdminPwd(env.getProperty("admin.pwd"));
	}
	//1. ApplicationContext ctx와 같은 Container가 만들어지고 
	//1 - 1. ctx.getEnvironment()로 Container의 Environment 객체를 setEnvironment(Environment env)메소드의 파라미터를 넘긴다.
	//2. setEnvironment(Environment env)에서 Evvironment 객체 Setter로 env 객체를 세팅하고
	//2-2. env.getProperties()로 모든 Properties파일을 찾는다.
	//그래서 이름이 afterPropertiesSet(): Properties를 가져와서 세팅한 후
	//그래서 init-method에서 env.get이 가능한 것
	// bean이 생성되기 전에 callback 으로 호출됨. 가장 먼저 호출됨.
	// MainClass에서 사용하는 env 정보가 넘어옴.
	@Override
	public void setEnvironment(Environment env) { //context가 getEnvironment을 호출해서 넘겨준다.
		System.out.println("called setEnvironment()");
		System.out.println(" - - - gCtx.load(\"classpath:beans.xml\") 에서 세팅됩니다.");
		setEnv(env); //Lombok으로 만듦
	}
}
