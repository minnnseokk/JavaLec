package chap04_controlStatement;

public class _13_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 찍기
		// 1. 몇 단이 될 for문
		System.out.println("구구단 출력");
		for(int i = 1; i <= 9; i++)
		{	//2. 곱하기 될 for문
			for(int j = 1; j <= 9; j++)
			{
				int result = i*j;
				System.out.println(i + " * " + j + " = " + result);
			} 
			// 엔터 값으로 단이 끝난 것을 표시
			System.out.println();
		}
		//2. 별 찍기
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		// 3. 삼각형 별 찍기
		System.out.println("1번");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i>=j)
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		System.out.println("2번");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i<=j)
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		System.out.println("3번");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>0; j--)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//j와 i의 처음숫자의 크기차이에 따라 *과 공백을 나누는게 중요
		System.out.println("---------------------------------");
		System.out.println("4번");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i<=j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
