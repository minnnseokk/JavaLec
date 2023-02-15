package chap04_controlStatement;

import java.io.IOException;

public class _16_infiniteWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = 0;
		while(true) {
			System.out.println("영문자 하나 입력 : ");
			
			num = System.in.read();
			//값을 입력할 때 전달하는 enter 또한 값으로 인식하기 때문에
			//enter에 해당되는 두개의 값을 제거하는 skip사용
			System.in.skip(2);
			
			System.out.println((char)num);
			
			if((char)num == 'q' || (char)num == 'Q')
			{
				break;
			}
			else
			{
				continue;
			}
		}
	}

}
