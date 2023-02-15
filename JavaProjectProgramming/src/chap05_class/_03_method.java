package chap05_class;

public class _03_method {

	// void 형태들은 메서드를 먼저 호출하고 사용해야하고
	// 타입이 있는 형태들은 필요한곳에 바로 호출이 가능하다
		
	static int sum;
	static long multi;
	static double devid;
	
	public static void main(String[] args) {
		// 반환타입이 있는 경우 해당 타입의 변수로 값을 받아줘도 된다.
		// 메서드의 결과 값(return값)이 해당변수에 저장
		int addResult = add(1,2);
		char aaa = (char)add(40,5); // 반환타입이 다른 변수는 에러가 뜸 => 강제 형변환 필요
		System.out.println("1 + 2 : " + addResult);
		// 반환타입이 있음으로 바로 사용가능
		System.out.println("50 + 5 : " + add(50, 5));
		add(5,6,7);
		// add함수를 통하여 sum의 값을 정함
		System.out.println("5 + 6 + 7 : " + sum);
		//형변환한 값 출력
		for(int i = 0; i< 20; i++)
		{
		System.out.print(aaa);
		}
		System.out.println();
		long multipleResult = multiple(10,11);
		// long multiple 메서드 변수
		System.out.println("10 * 11 = " + multipleResult);
		// long multiple 메서드
		System.out.println("12 * 13 = " + multiple(12,13));
		// void multiple 메서드
		multiple(14,15,16);
		System.out.println("14 * 15 * 16 = " + multi);
		System.out.println("--------------------");
		// 빼기
		sum = Minus(10,5);
		System.out.println("10 - 5 = " + sum);
		System.out.println("20 - 10 = " + Minus(20,10));
		Minus(30, 15, 5);
		System.out.println("30 - 15 - 5 = " + sum);
		System.out.println("--------------------");
		// 나누기
		devid = devide(100,3);
		System.out.println("100 / 3 = " + devid);
		System.out.println("150 / 5 = " + devide(150, 5));
		devide(200, 5, 3);
		System.out.println("200 / 5 / 3 = "+ devid);


	}
	// 메서드 지정
	// 같은 클래스에서 사용할 메서드는 static 선언
	//반환타입이 int여서 return int 형태로 지정
	public static int add(int a, int b) // 같은 클래스 내에서 사용하기위해 static 사용
	{
		return a + b;
	}
	
	//오버로딩된 메소드(매개변수의 타입이나 개수가 다르고 메서드의 이름은 같다)
	//void형태는 반환값이 없는 타입이므로 return문이 필요없다.
	public static void add( int a, int b, int c)
	{
		sum = a + b + c;
	}
	// 곱하기 메서드 만들기(메서드명 : multiple, 반환타입 long(매개변수 2개)
	public static long multiple(long a, long b)
	{
		return a * b;
	}
	// void(매개변수 3개)
	public static void multiple(long a, long b, long c)
	{
		multi = a*b*c;
	}
	
	// 빼기 메서드
	public static int Minus(int a, int b)
	{
		return a -b;
	}
	public static void Minus(int a, int b, int c)
	{
		sum = a-b-c;
	}
	// 나누기 메서드
	public static double devide(int a, int b)
	{
		return (double)a/b;
	}
	public static void devide(int a, int b, int c)
	{
		devid = (double)a/b/c;
	}
}
