package chap99_etc;

import java.util.Scanner;

import chap99_etc.games.GamesClass;
import chap99_etc.games.Lotto;
import chap99_etc.games.NumBaseball;
import chap99_etc.games.RockScissPaper;

public class _06_gameLanucher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모클래스인 gamesClass 선언
		GamesClass gc;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("게임을 선택하세요.");
			System.out.println("1. 가위바위보");
			System.out.println("2. 야구게임");
			System.out.println("3. 로또게임");
			
			int gameSelector = sc.nextInt();
			switch(gameSelector) {
			case 1:
				gc = new RockScissPaper();
				//선언은 부모클래스로 했지만
				//오버라이딩된 메서드를 호출하면 자식의 메서드가 실행된다.
				gc.start();
				break;
			case 2:
				//자동형변환
				//자식 객체가 부모의 형태로 형변환 후
				//gc에 담김
				gc = new NumBaseball();
				//1번과 같은 start메서드를 호출해도
				//전혀 다른 게임이 실행된다.
				gc.start();
				break;
			case 3:
				gc = new Lotto();
				gc.start();
				break;
				
			}
		}
	}

}
