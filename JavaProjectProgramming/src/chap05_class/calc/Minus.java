package chap05_class.calc;

public class Minus 
{
	//num1~3은 같은 패키지의 클래스에서 사용가능
	//맴버변수 : 객체가 고유의 특성 -> 다른 클래스에서 접근하여 변경할 수 있으면
	//고유의 특성이 사라지는 경우가 발생 -> 멤버변수는 거의 private으로 선언한다.
	public int num1;
	protected int num2;
	int num3; // default 접근제어자
	//num4는 Minus 클래스에서만 사용가능
	private int num4;
	
	public int minu(int a, int b) 
	{
		return a - b;
	}
	// private 멤버변수의 값을 가져오는 getter 메서드
	public int getNum4()
	{
		return num4;
	}
	
	// private 멤버변수 값을 변경하는 setter 메서드
	public void setNum4(int num4)
	{
		//this는 이 객체를 의미(Minus 객체를 가리킴)
		this.num4 = num4;
	}
}
