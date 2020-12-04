package com.example;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MyInfo {
	// Properties
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BmiCalculator bmiCalculator;

	// Getter, Setter, Constructor, toString: lombok 사용
	// Method
	public void bmiCalcu() {
		this.bmiCalculator.bmiCalcu(this.weight, this.height);
	}
	public void printHobby() {
		/*
		 * for(int i=0; i < this.hobby.size();i++) {
		 * System.out.println(this.hobby.get(i)); }
		 */
		/*
		 * for(String str : this.hobby) { System.out.println(str); }
		 */
		this.hobby.forEach(str -> System.out.println(str));
	}
}
