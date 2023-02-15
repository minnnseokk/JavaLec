package chap05_class.calc;

public class Add {
	// 속성 값들 정의(멤버변수)
	int num1;
	int num2;
	int result;

	// 기능들 정의(멤버메소드)
	public int add(int num1, int num2)
	{
		result = num1 + num2;
		return result;
	}

}
