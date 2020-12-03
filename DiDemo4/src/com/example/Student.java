package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component("student") //id�� student�� ���´�: ���� �������߱� ����
public class Student {
	@Value("������")
	private String name;
	@Value("25")
	private int age;
	@Value("���, ����, ����") //�迭���� ������ ������ �޸��� ���
	private List<String> hobbys;
	@Value("165")
	private double height;
	@Value("49.2")
	private double weight;
}
