package chap99_etc.games;

import java.util.Scanner;

public class NumBaseball extends GamesClass{

	// 1. 변수 생성
	// 스트라이크와 볼의 개수를 세어줄 변수
	int strike = 0;
	int ball = 0;

	// 게임 회수(사용자가 입력할 때마다 1씩 증가)
	private int gameCnt = 0;

	// 컴퓨터 랜덤 값 3개 저장할 배열(중복 불가능)
	private int[] com = new int[3];
	// {(int)(Math.random()*10), (int)(Math.random ()*10),(int)( Math.random()*10)};

	// 유저가 입력할 3개 배열(중복 불가능)
	private int[] userNum = new int[3];

	// 입력 값 받을 스캐너
	public void start() {
		Scanner sc = new Scanner(System.in);

		// 중복인지 아닌지 판단할 변수

		// 2. 랜덤값 3개 생성(중복되면 다시 생성하도록 처리)
		generateRandom();
		System.out.println("컴퓨터 : {" + com[0] + "," + com[1] + "," + com[2] + "}");

		while (true) {
			// 초기화를 안하면 strike와 ball의 이전값이 쌓인 값으로 출력되게 된다.
			int strike = 0;
			int ball = 0;

			// 3. 사용자 입력값 3개 받아서 user배열에 저장
			// gameCnt++; 회수 중가
			getUserInput();

			// 4. 스트라이크/ 볼 판정
			// 5. 스트라이크/ 볼 횟수 출력
			// 6. 스트라이크와 볼 개수로 3스트라이크가 아닐때
			// 다시 사용자가 입력하도록
			// 3스트라이크일때는 게임 종료
			// judgeStrike 메서드에서 strike가 3 이상일 경우
			// true를 리턴하기 때문에 if문의 메서드가 true일 때는
			// 무조건 strike가 3 이상이다 = > 게임 종료
			// strike < 3 => 다시 사용자 값 입력받기(while문으로 돌아가기)
			if(judgeStrike()) {
				break;
			}else {
				continue;
			}

		}
	}

	// 랜덤 값 3개 생성해서 COM배열에 담아주는 메서드(중복체크)
	public void generateRandom() {
		boolean isComDuplicated = false;
		for (int i = 0; i < userNum.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			// 중복체크
			// checkDuplicate()의 결과가 true일때
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						isComDuplicated = true;
						break;
					}
				}
				if (checkDuplicate(com,i)) {
					i--;
					continue;
				}
			}
		}
	}

	// 3. 사용자 입력값 3개 받아서 user배열에 저장 메서드(중복체크)
	// gameCnt++; 회수 중가
	public void getUserInput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < userNum.length; i++) {
			System.out.print("1~9중 하나의 정수를 입력하시오 중복X : ");
			userNum[i] = sc.nextInt();

			// 중복체크
			if (i > 0) {
				if (checkDuplicate(userNum,i)) {
					// 중복일경우
					i--;
					continue;
				}
			}
		}
		//중복값이 없는 온전한 user배열이 완성

		System.out.println("{" + userNum[0] + "," + userNum[1] + "," + userNum[2] + "}");
		gameCnt++;

	}

	// 중복체크(리턴 값 boolean으로 true, false)
	// checkDuplicate
	// arr은 com배열이나 user배열을 받아줄 매개변수
	public boolean checkDuplicate(int [] array, int num) {
		for(int j = 0; j < num; j++) {
			if(array[num] == array[j]) {
				return true; //중복일 경우
			}
		}
		//중복이 아닌경우
		//for문안의 if문을 타지 않으면 결국 for문 밖까지 나오게 됨
		return false;
	}

	// 스트라이크/볼 판정, 스트라이크 볼 출력,
	// 스트라이크 개수로 계속 입력인지 게임종료인지 판단해주는 메서드
	// (리턴 값 boolean으로 true, false)
	// strike < 3면 return false; else return true;
	public boolean judgeStrike() {
		//스트라이크/ 볼 판정
		// 중첩 for문 사용
		// com[i] == user[j] 일때
		// i == j 스트라이크 판정 strike++
		// com[i] == user[j] 일때
		// i != j 볼 판정 ball++
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < userNum.length; j++) {
				if (userNum[j] == com[i]) {
					if (i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		System.out.println(strike + "스트라이크" + ball + "볼입니다.");
		
		if (strike < 3) {
			return false;
		} else {
			System.out.println("정답입니다");
			System.out.println("컴퓨터 : {" + com[0] + "," + com[1] + "," + com[2] + "}");
			System.out.println(gameCnt + "회만에 맞추셨습니다.");
			return true;
		}
		
	}
}
