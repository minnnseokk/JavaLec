package chap05_class;

import chap05_class.calc.Minus;

public class _02_accessModifier extends Minus // Minus의 연장클래스
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Minus m = new Minus(); // Minus 클래스 호출 생성자 
		
		//접근 제어자 확인
		m.num1 = 10; //public Minus 클래스의 변수가져옴
//		m.num2 = 10; // protected 상속되어있지 않으면 에러
//		m.num3 = 10; // default 같은 패키지 내에 존재하지 않으면 에러
//		m.num4 = 10; // private 같은 클래스 안에서만 사용가능
		m.minu(20, 10); //public 메서드 어디서든지 접근 가능
		System.out.println(m.num1 + " , " + m.minu(20,10));
	}

}
