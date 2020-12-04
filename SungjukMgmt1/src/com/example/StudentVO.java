package com.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter						//Setter 생성
@Getter						//Getter 생성
//@AllArgsConstructor			//생성자: 모든 Property를 파라미터로 갖는 생성자
@RequiredArgsConstructor	//일부 Property를 파라미터로 갖는 생성자 연습
//@NoArgsConstructor			//기본 생성자
//@ToString					//ToString 생성
public class StudentVO { //lombok: @Setter로 Setter가 자동으로 만들어진다. Outline View로 확인 가능
	//Member
	private @NonNull String hakbun;
	private @NonNull String name;
	private @NonNull int kor;
	private @NonNull int eng;
	private @NonNull int mat;
	private @Setter int tot;
	private @Setter double avg;
	private @Setter char grade;
	//Getter Setter: Lombok 이용
}
