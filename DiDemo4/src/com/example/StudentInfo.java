package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Component
public class StudentInfo {
	//Student�� �ϳ��ۿ� ��� ���� ������ Component-scan�� �ؾ��Ѵ�.
	//�ٵ� XML�ƴ϶� Component-scan ����
	//�׷��� �̷��� ����Ѵ�: �̰� ����!!!!
	//onMethod�� ���� ������ 65 ����: Setter�޼ҵ忡 �߰��� �޼ҵ�
	//�迭�̸� �߰�ȣ ���
	//Setter�� ���� Setting�� �� onMethod_ = {@Autowired} �ش� �޼ҵ忡 @Autowired�� �߰�: �׳� @AutoWired�ص� �ȴ�.
	@Setter(onMethod_ = {@Autowired}) //id�� student�� ���̸� ã�´�. �ݵ�� Annotation �κ��� �����ϱ�
	private Student student; //�̰� �ݵ�� ����?

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