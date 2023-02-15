package chap05_class.calc;

public class Multiple {
	Minus m = new Minus(); // Minus 클래스 호출 생성자
	
	public Multiple() 
	{
	//접근 제어자 확인
	m.num1 = 10; //public 
	m.num2 = 10; // protected 상속되어있지 않으면 에러
	m.num3 = 10; // default 같은 패키지 내에 존재하지 않으면 에러
	//m.num4 = 10; // private 같은 클래스 안에서만 사용가능
	m.setNum4(20); // m이라는 객체의 num4의 값을 20으로 변경
	int Num4 = m.getNum4(); 
	
	m.minu(20, 10); //public 메서드 어디서든지 접근 가능
	}

}