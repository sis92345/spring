package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import lombok.Getter;
import lombok.Setter;

public class admin implements EnvironmentAware, InitializingBean, DisposableBean {
	//������ �޼ҵ�
	//InitializingBean: afterPropertiesSet(): Bean �ʱ�ȭ
	//DisposableBean: destroy(): Bean �Ҹ�
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
		System.out.println(" - - - gCtx.refresh();���� ���õ˴ϴ�.");
		//admin ��ü�� �ʱ�ȭ�� �� �ش� ������Ƽ ����
		setAdminId(env.getProperty("admin.id"));
		setAdminPwd(env.getProperty("admin.pwd"));
	}
	//1. ApplicationContext ctx�� ���� Container�� ��������� 
	//1 - 1. ctx.getEnvironment()�� Container�� Environment ��ü�� setEnvironment(Environment env)�޼ҵ��� �Ķ���͸� �ѱ��.
	//2. setEnvironment(Environment env)���� Evvironment ��ü Setter�� env ��ü�� �����ϰ�
	//2-2. env.getProperties()�� ��� Properties������ ã�´�.
	//�׷��� �̸��� afterPropertiesSet(): Properties�� �����ͼ� ������ ��
	//�׷��� init-method���� env.get�� ������ ��
	// bean�� �����Ǳ� ���� callback ���� ȣ���. ���� ���� ȣ���.
	// MainClass���� ����ϴ� env ������ �Ѿ��.
	@Override
	public void setEnvironment(Environment env) { //context�� getEnvironment�� ȣ���ؼ� �Ѱ��ش�.
		System.out.println("called setEnvironment()");
		System.out.println(" - - - gCtx.load(\"classpath:beans.xml\") ���� ���õ˴ϴ�.");
		setEnv(env); //Lombok���� ����
	}
}
