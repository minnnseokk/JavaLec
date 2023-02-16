package chap05_class;

import java.util.Scanner;

import chap05_class.calc.Calculator;

public class _10_inputCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 두번째 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("사칙연산중 하나 선택(+, -, *, /, %) : ");
		String op = sc.next();
		
		//Calculator 객체 생성
		//calc.num1, calc.num2, calc.op는 사용자가 입력한 값으로 초기화(대입)
		Calculator calc = new Calculator(num1, num2, op);

		//결과 출력
		calc.calc();
	}

}
