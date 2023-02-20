package chap99_etc.games;

import java.util.Scanner;

public class RockScissPaper {

	// 가위, 바우빕, 보 게임 객체를 생성하여 게임을 진행할 수 있도록 리터링

	// 몇승 몇무 몇패인지 셀 변수
	private int win = 0;
	private int draw = 0;
	private int lose = 0;

	// 승점 담아줄 변수(승:1, 무:0, 패:-1)
	private int score = 0;

	// 승무패 기록을 담아줄 배열
	private int[] wdl = new int[10];

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < wdl.length; i++) {
			//랜덤변수 선언 메서드 호출
			int com = generateRandom();
			// 사용자 입력 메서드 호출
			int userNum = convertUserInput(sc);
			if (userNum == 0) {
				System.out.println("잘못 입력하셨습니다.");
				i--;
				continue;
			}
			//승무패 판단 메서드 호출
			judgeWdl(userNum, com, i);
			//승점계산 메서드 호출
			sumScore();
		}

	}

// 1~3 중 랜덤 값 발생 메서드
	public int generateRandom() {
		return (int) (Math.random() * 3) + 1;
	}

// 사용자 입력값을 정수형으로 변환해주는 메서드
	public int convertUserInput(Scanner sc) {
		System.out.print("가위,바위,보 중 하나를 입력하세요. : ");
		String userNumStr = sc.nextLine();
		if (userNumStr.equals("가위")) {
			return 1;
		} else if (userNumStr.equals("바위")) {
			return 2;
		} else if (userNumStr.equals("보")) {
			return 3;
		} else {
			return 0;
		}
	}

// 승패판단 메서드
	public void judgeWdl(int userNum, int com, int i) {
		if (userNum == com) {
			System.out.println("비겼습니다.");
			draw++;
			wdl[i] = 0;
		} else if ((userNum == 1 && com == 3) || (userNum == 2 && com == 1) || (userNum == 3 && com == 2)) {
			System.out.println("이겼습니다.");
			win++;
			wdl[i] = 1;
		} else if ((userNum == 1 && com == 2) || (userNum == 2 && com == 3) || (userNum == 3 && com == 1)) {
			System.out.println("졌습니다.");
			lose++;
			wdl[i] = -1;
		}
	}
//승점계산 메서드
	public void sumScore()
	{
		for (int i = 0; i < wdl.length; i++) {
			score += wdl[i];
		}
		System.out.println("전적은 " + win + "승 " + draw + "무 " + lose + "패. 총 승점 : " + score);
	}
}
