package chap05_class.calc;

import java.io.IOException;

public class Calculator {
	// 사용자 입력 값을 받아줄 멤버변수(정수1, 정수2, 연산자)
	private int num1;
	private int num2;
	private String op;

	public Calculator() {

	}

	// 멤버변수를 사용자가 입력한 값을 초기화하기 위한 생성자
	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	// 사용자가 입력한 값(정수1, 정수2)으로 사칙연산하는 메서드 4개
	public int add() {
		return num1 + num2;
	}

	public int minus() {
		return num1 - num2;
	}

	public long multiple() {
		return (long) num1 * num2;
	}

	public double devide() {
		return (double) num1 / num2;
	}

	public int remain() {
		return num1 % num2;
	}

	// 사칙연산 결과를 출력해주는 메서드
	public void calc() {
		//사용자가 입력한 연산자(op)값에 따라 조건처리
		switch (op) {
		//op = "+"일때 더한 결과값을 반환하는 add메서드 호출
		case "+":
			System.out.println("결과 :" + num1 + " + " + num2 + " = " + add());
			break;
		//op = "-"일때 감한 결과값을 반환하는 minus메서드 호출
		case "-":
			System.out.println("결과 :" + num1 + " - " + num2 + " = " + minus());
			break;
		//op = "*"일때 곱한 결과값을 반환하는 multiple메서드 호출
		case "*":
			System.out.println("결과 :" + num1 + " * " + num2 + " = " + multiple());
			break;
		//op = "/"일때 나눈 결과값을 반환하는 devide메서드 호출
		case "/":
			System.out.println("결과 :" + num1 + " / " + num2 + " = " + devide());
			break;
		//op = "%"일때 나머지값을 반환하는 remain메서드 호출
		case "%":
			System.out.println("결과 :" + num1 + " % " + num2 + " = " + remain());
			break;
		}
	}
}
