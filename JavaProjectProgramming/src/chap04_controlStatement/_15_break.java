package chap04_controlStatement;

public class _15_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for, break
		System.out.println("---------------------------------");
		for(int i=1; i<10; i++)
		{
			if(i==6) 
			{
				break;
			}
			System.out.println(i);
		}
		//2. while, break
		System.out.println("---------------------------------");
		int num = 0;
		while (++num<10)
		{
			if(num == 6)
			{
				break;
			}
			System.out.println(num);
		}
		//구구단중 5단까지만 출력, 4단 제외
		System.out.println("---------------------------------");
		for(int i =1; i<10; i++)
		{
			if(i>5)
			{
				break;
			}
			if(i == 4)
			{
				continue;
			}
			for(int j=1;j<10;j++)
			{
				int result = i*j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println();
		} 
		// 가능한 중첩 반복문에서는 바깥쪽의 반복문에서 continue나 break를 해야한다 어디에서 끝낼지 확실히하기
	}


}
