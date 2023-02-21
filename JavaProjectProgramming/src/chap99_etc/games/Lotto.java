package chap99_etc.games;

import java.util.Scanner;

public class Lotto extends GamesClass{
	// 당첨번호 담아줄 배열 6개 + 보너스번호 1개
	// 인덱스가 0~5: 로또번호, 인덱스 6: 보너스 번호
	int[] lottoNum = new int[7];
	int[] userInput = new int[6];
	// 맞은 숫자 갯수 세는 변수
	int correctCnt = 0;
	// 보너스번호 맞았는지 확인하는 변수 맞으면 true로 변경
	boolean bonus = false;
	// 중복체크에서 사용할 변수(중복판단 변수)
	boolean isDuplicated = false;	
	
	@Override
	public void start() 
	{
		// 1~45까지중 랜덤 7개 배열에 담아줌(중복은 제거)
		generateRandom();
		
		getUserInput();
		
		// 당첨번호와 사용자 번호 비교
		compareNum();

		printResult();
	}
	//1~45중  7개의 랜덤값 lottoNum에 담아주는 메서드
	//lottoNum 출력도 포함
	public void generateRandom()
	{
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45 + 1);
			if (i > 0) {
				if(isDuplicated(i,lottoNum)) {
					i--;
					continue;
					}
				else{
					isDuplicated = false;
					continue;
				}
				}
			
			}

		
		System.out.print("이번 주 로또번호");
		for (int i = 0; i < lottoNum.length; i++) {
			if (i == 6) {
				System.out.println("보너스 번호: " + lottoNum[i]);
			} else {
				System.out.print(lottoNum[i] + ", ");
			}
		}
	}
	
	//1~45까지 사용자 입력 값 6개 받아서 userNum에 담아주는 메서드
	public void getUserInput()
	{
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < userInput.length; i++) {
			System.out.print("1~45의 숫자 하나를 입력해주세요(중복불가) : ");
			userInput[i] = sc.nextInt();
			if (userInput[i] > 45 || userInput[i] < 1) {
				System.out.println("잘못된 입력");
				i--;
				continue;
			}
			if(isDuplicated(i,userInput)) {
				i--;
				continue;
				}
			else{
				isDuplicated = false;
				continue;
			}
		}
	}
	
	//당첨번호와 사용자번호 비교해주는 메서드
	public void compareNum()
	{
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = 0; j < userInput.length; j++) {
				// 로또번호 인덱스가 i인
				if (lottoNum[i] == userInput[j]) {
					if (i == 6) {
						bonus = true;
					} else {
						correctCnt++;
					}
				}
			}
		}
	}
	
	//등수출력 메서드
	// 사용자 번호 담아줄 배열
	// 6개 다 맞을 경우 1등
	// 5개 + 보너스 2등
	// 5개 3등
	// 4개 4등
	// 3개 5등
	// 나머지는 꽝
	public void printResult() {
		System.out.println(correctCnt + "개 일치합니다.");
		if (correctCnt == 6) {
			System.out.println("1등입니다.");
		} else if (correctCnt == 5) {
			if (bonus) {
				System.out.println("2등입니다.");
			} else {
				System.out.println("3등입니다.");
			}
		} else if (correctCnt == 4) {
			System.out.println("4등입니다.");
		} else if (correctCnt == 3) {
			System.out.println("5등입니다.");
		} else {
			System.out.println("꽝입니다.");
		}
	}
	
	//중복체크 메서드
	public boolean isDuplicated(int i, int [] arr)
	{
		for(int j = 0; j<i; j++)
		{
			if(arr[i] == arr[j])
			{
				System.out.println("중복된 값입니다. 다시 입력하세요.");
				return true;
			}
		}
		return false;
	}
}




