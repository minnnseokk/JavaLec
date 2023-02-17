package chap99_etc;

import java.util.Scanner;

public class _03_rockScissPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNum;
		// 몇승 몇무 몇패인지 셀 변수
		int win = 0;
		int draw = 0;
		int lose = 0;

		// 승점 담아줄 변수(승:1, 무:0, 패:-1)
		int score = 0;

		// 승무패 기록을 담아줄 배열
		int[] wdl = new int[10];

		for (int i = 0; i <= 10; i++) {
			// 1~3까지 랜덤 변수 발생 (1: 가위, 2: 바위, 3: 보)
			String[] rspObj = { "가위", "바위", "보" };
			String com = rspObj[(int) (Math.random() * 3)];

			System.out.print("가위,바위,보 중 하나를 입력하세요. : ");
			String userNumStr = sc.nextLine();
			if (userNumStr.equals("가위")) {
				userNum = 1;
			} else if (userNumStr.equals("바위")) {
				userNum = 2;
			} else if (userNumStr.equals("보")) {
				userNum = 3;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				// 해당 게임을 다시 진행하기 위해 1 감소
				// for문에서 continue문을 만나면 증감식으로 이동하기 때문
				i--;
				continue;
			}
			if (userNumStr == com) {
				System.out.println("비겼습니다.");
				draw++;
				wdl[i] = 0;
			} else if ((userNumStr == "가위" && com == "보") || (userNumStr == "바위" && com == "가위")
					|| (userNumStr == "보" && com == "주먹")) {
				System.out.println("이겼습니다.");
				win++;
				wdl[i] = 1;
			} else if ((userNumStr == "가위" && com == "주먹") || (userNumStr == "바위" && com == "보")
					|| (userNumStr == "보" && com == "가위")) {
				System.out.println("졌습니다.");
				lose++;
				wdl[i] = -1;
			}

		}
		//점수계산
		for(int j =0; j<wdl.length; j++) {
			score += wdl[j];
		}
		System.out.println("전적은 " + win + "승 " + draw + "무 " + lose + "패. 총 승점 : " +score);
	}

}
