package com.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("student") //student�� ȣ��
public class StudentVO {
	@Value("2020-01")
	private String hakbun;
	@Value("������")
	private String name;
	@Value("100")
	private int kor;
	@Value("84")
	private int eng;
	@Value("76")
	private int mat;
	private int tot;
	private double avg;
	private char grade;
}
