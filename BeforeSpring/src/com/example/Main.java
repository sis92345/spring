package com.example;

public class Main {
	public static void main(String[] args) {
		/*
		 * My Calculator를 이용해서 계산: My Calculator는 Caculator.class에 종속
		 * - 만드는 순서: 종속 당하는 클래스 --> 종속 하는 클래스
		 * - Main은 Calculator를 MyCalculator를 실행한다.
		 * - 즉 실제 데이터 처리: Calculator
		 * - Controll: MyCalculator
		 * - 여기서 중요한 건 개발자가 의존성 관리를 한다는 것
		 * - - 생성자를 통해서?, Setter를 통해서?
		 * - - - 즉 의존하는 클래스를 생성자나 Setter로 넣을 수 있다.
		 * - - - - 이게 개발자 주도의 DI
		 */
		MyCalculator myCalculator = new MyCalculator(new Calculator(), 10, 2); //생성자로 주입할 수 있다.
		//myCalculator.setCalculator(new Calculator()); //Calculator를 넘겨준다.
		//myCalculator.setFirstNum(10); //값을 넘겨준다.
		//myCalculator.setSecondNum(2);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}
}