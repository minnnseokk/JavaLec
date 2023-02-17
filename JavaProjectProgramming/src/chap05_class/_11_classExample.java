package chap05_class;

import java.util.Scanner;

import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 숙제 - while문을 이용해서 무한으로 프로그램 재시작
		// q나 Q가 입력되었을때 프로그램 종료
		while (true) {
			System.out.println("거리의 단위를 변환합니다.(q나Q입력시 종료)");
			String code = sc.nextLine();
			// scanner는 String 값을 받아준다.
			// String 비교는 equals 메서드를 사용한다.
			// String은 jdk에서 제공하는 기본 클래스를 사용하기 때문에
			// ==비교할 시 객체의 동일성(주소값)을 비교한다.
			// String의 값이 같은지 비교할 때는 equals를 사용한다.
			if(code.equals("Q")||code.equals("q"))
			{
			break;
			}
			System.out.print("변환할 거리를 입력해주세요.(정수, m단위) : ");
			long distance = sc.nextLong();

			System.out.print("변환할 단위를 입력해주세요.(cm, mm, km, inch) : ");
			String unit = sc.next();

			DistanceChanger dc = new DistanceChanger(distance, unit);

			dc.changeUnit();
			// 객체생성
			// 변환된 단위로 출력
			// inch 변환 == m*39.37
			
			System.out.println("-------------------------------------");
			
		}

	}
}