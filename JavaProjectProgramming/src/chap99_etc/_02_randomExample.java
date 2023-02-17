package chap99_etc;

import java.util.Scanner;

public class _02_randomExample {

	public static void main(String[] args) {
		// 컴퓨터는 1 ~ 3까지 랜덤생성

		// 사용자가 1 ~ 3까지 입력

		// 사용자가 입력한 값이 컴퓨터가 생성한 랜덤 값과 같으면 "맞췄습니다." 출력
		// 아니면 "틀렸습니다." 출력
		Scanner sc = new Scanner(System.in);
		while (true) {
			int com = (int) (Math.random() * 3) + 1;
			System.out.print("1~3까지 입력해주세요 : ");
			int userInput = sc.nextInt();
			if (com == userInput) 
			{
				System.out.println("컴퓨터 : " + com + ", " + "유저 : " +userInput);
				System.out.println("맞췄습니다.");
				break;
			} 
			else 
			{
				System.out.println("컴퓨터 : " + com + ", " + "유저 : " +userInput);
				System.out.println("틀렸습니다. 다시 해보세요");
			}
		}

	}

}
