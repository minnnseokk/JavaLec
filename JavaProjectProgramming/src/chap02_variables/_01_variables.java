package chap02_variables;

public class _01_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문장이 끝날때마다 ; 필수 입력해야함
		int num1; // int 변수선언(자료형 변수명)
		num1 = 100; // 변수초기화
		System.out.println("int 변수 출력");
		System.out.println(num1); // 변수의사용
		System.out.println("-----------------------------------");
		
		long bigNum1 = 1000000000L; // long 변수 선언과 초기화
		System.out.println("long 변수 출력");
		System.out.println(bigNum1); // 변수의사용
		System.out.println("-----------------------------------");
		
		short sNum1 = 1;
		short sNum2 = 2; // short 변수선언과 초기화
		//문장(문자열)은 큰 따옴표(") 사용
		System.out.println("short 변수 출력");
		System.out.println(sNum1 + sNum2); // short 변수의 연산과 사용
		System.out.println("-----------------------------------");
		
		//string은 JRE의 자바 클래스 라이브러리에 만들어놓은 클래스를 사용하여 생성한다.(원시타입(자료형)이 아님, 참조타입)
		String str = "문장(문자열)을 생성하는 클래스";
		System.out.println(str);
		System.out.println("-----------------------------------");

		
		char ch1 = 'A';
		int ch2 = 'A'; // char 변수 선언과 초기화
		//char은 하나의 문자를 값으로 지정하기 때문에 작은 따옴표(') 사용
		System.out.println("char 변수 출력");
		System.out.println(ch1);
		System.out.println(ch2); 
		System.out.println((int)ch1); 
		System.out.println((char)ch2); // 선언을 아스키코드의 문자로 했으면 문자와 해당 아스키코드의 숫자값으로의 형변환이 가능
		System.out.println("-----------------------------------");

		float fNum = 3.14f;
		double dNum = 3.14; // 실수형 변수 선언과 초기화
		System.out.println("실수형 변수 출력");
		System.out.println(fNum);
		System.out.println(dNum); // 사용
		System.out.println("-----------------------------------");

		boolean result1 = false;
		boolean result2 = false; // boolean 변수선언과 초기화		
		int num2 = 10;
		int num3 = 11;
		result1 = num2 % 2 == 0 ? true : false;
		result2 = num3 % 2 == 0 ? true : false; 
		// 삼항 연산자 (?의 앞의 조건이 충족하면 ? 뒤의 값, 충족하지 못하면 : 뒤의 값을 선택)
		// num2(num3)을 2로 나눈 나머지 값이 0이면 true 아니면 false 반환
		System.out.println("boolean 변수 출력");
	    System.out.println(result1);
	    System.out.println(result2);

	}

}
