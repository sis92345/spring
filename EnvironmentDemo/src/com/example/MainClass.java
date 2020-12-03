package com.example;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		//����: ConfigurableApplicationContext
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		//1. ctx.getEnvironment(); �ش� Container�� ȯ���� �ҷ��´�
		ConfigurableEnvironment env = ctx.getEnvironment();
		//2. env.getPropertySources(); �ش� Contatiner���� ������� env���� MutablePropertySources�� ����
		//�� ���� Environment���� ��� Properties ������ �����´�.
		MutablePropertySources propertySouces = env.getPropertySources();
		// ���� ���ϴ� ������ ���� ������ ��� propertySources�� �տ��� ���� ���ʷ� ��� �˻���.
		try {
			propertySouces.addLast(new ResourcePropertySource("classpath:admin.properties")); // property �߰�
			System.out.println("--����� ���������� ȣ��Ǿ��� Ȯ���� ���� ��--");
			System.out.println(env.getProperty("admin.id")); // property ����
			System.out.println(env.getProperty("admin.pwd"));
		} catch (IOException ex) {
		}
		System.out.println("--������� ȣ��� ������ ����--");
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
