package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Component
public class StudentInfo {
	//Student는 하나밖에 없어서 문제 없지만 Component-scan을 해야한다.
	//근데 XML아니라서 Component-scan 못함
	//그래서 이렇게 사용한다: 이거 이해!!!!
	//onMethod는 교재 페이지 65 참고: Setter메소드에 추가할 메소드
	//배열이면 중괄호 사용
	//Setter를 통해 Setting할 때 onMethod_ = {@Autowired} 해당 메소드에 @Autowired를 추가: 그냥 @AutoWired해도 된다.
	@Setter(onMethod_ = {@Autowired}) //id가 student인 아이를 찾는다. 반드시 Annotation 부분을 공부하기
	private Student student; //이거 반드시 질문?

	public void printInfo() {
		if (this.student != null) {
			System.out.println("Name : " + this.student.getName());
			System.out.println("Age : " + this.student.getAge());
			System.out.println("Hobbies");
			this.student.getHobbys().forEach(hobby -> System.out.println(hobby));
			System.out.println("Height : " + this.student.getHeight());
			System.out.println("Weight : " + this.student.getWeight());
		}
	}
}