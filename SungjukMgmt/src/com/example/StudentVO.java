package com.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter						//Setter 생성
@Getter						//Getter 생성
//@AllArgsConstructor			//생성자: 모든 Property를 파라미터로 갖는 생성자
//@RequiredArgsConstructor	//일부 Property를 파라미터로 갖는 생성자 연습
//@NoArgsConstructor			//기본 생성자
//@ToString					//ToString 생성
public class StudentVO { //lombok: @Setter로 Setter가 자동으로 만들어진다. Outline View로 확인 가능
	//Member
	private String hakbun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;
	//Getter Setter: Lombok 이용
}
