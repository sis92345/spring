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
@Component("student") //id는 student로 들어온다: 따로 지정안했기 때문
public class Student {
	@Value("한지민")
	private String name;
	@Value("25")
	private int age;
	@Value("등산, 게임, 독서") //배열같이 복수로 들어오면 콤마를 사용
	private List<String> hobbys;
	@Value("165")
	private double height;
	@Value("49.2")
	private double weight;
}
