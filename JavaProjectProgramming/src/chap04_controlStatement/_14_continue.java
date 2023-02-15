package chap04_controlStatement;

public class _14_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for에서의 continue
		for(int i = 1; i<10; i++)
		{
			if(i==6) // i가 6일때 for의 내용을 실행하지 않고 다음 증감식으로 넘어간다
			{
			continue;
			}
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		//2. while에서의 continue
		int num = 0;
		while (++num < 10)
		{
			if(num == 6)
			{
				continue;
			}
			System.out.println(num);
		}
	}

}
