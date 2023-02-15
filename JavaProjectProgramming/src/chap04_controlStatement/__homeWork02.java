package chap04_controlStatement;

import java.io.IOException;

public class __homeWork02 {
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("영문자 하나를 입력하세요 : ");
			int enter = System.in.read();			
			System.in.skip(2);
			
			if(enter >= 65 && enter <= 90)
			{
				enter += 32;
				System.out.println("대문자입니다");
				System.out.print("소문자로 변환됨 : ");
			}
			else if(enter >= 97 && enter <= 122)
			{
				enter -= 32;
				System.out.println("소문자입니다");
				System.out.print("대문자로 변환됨 : ");
			}
			System.out.println((char)enter);
			System.out.println("--------------------------------");
		}
	}
}
