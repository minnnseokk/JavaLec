package chap03_operator;

import java.io.IOException;

public class __homework01 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.print("영문자 하나를 입력하세요 : ");
		int enter = System.in.read();
		//대문자인지 체크
		int result = (enter >= 65 && enter <= 90) ? (enter + 32) : (enter - 32);
		System.out.print("대소문자 변환됨 : ");
		System.out.println((char)result);
	}

}
