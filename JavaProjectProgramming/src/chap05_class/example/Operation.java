package chap05_class.example;

public class Operation {
	int result1 = 0; // 전역변수
	
	public int add(int a, int b)
	{
		int result2 = a + b;
		return result2; // 지역변수
	}
	
	public int add(int a)
	{
		result1 += a;
		return result1;
	}
}
