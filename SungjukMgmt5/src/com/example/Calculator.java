package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Component//calulator�� ȣ���Ѵ�.
public class Calculator {
	//@ onmethod
	@Setter(onMethod_ = {@Autowired}) //StudentVo Type�� ȣ��, �̰� ���ظ� �ϸ�ȴ�. �̰� �� �ڵ�?
	private StudentVO student;
	
	public void calcTot() {
		int tot = this.student.getKor() + this.student.getEng() + this.student.getMat();
		this.student.setTot(tot);
	}
	public void calcAvg() {
		double avg = this.student.getTot() / 3.;
		this.student.setAvg(avg);
	}
	public void calcGrade() {
		char grade = (this.student.getAvg() >= 90) ? 'A' :
			                    (this.student.getAvg() >= 80) ? 'B' :
			                    	(this.student.getAvg() >= 70) ? 'C' :
			                    		(this.student.getAvg() >= 60) ? 'D' : 'F';
		this.student.setGrade(grade);
	}
}
