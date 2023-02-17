package chap99_etc;

public class _01_mathRandom {

	public static void main(String[] args) {
		//0~0.9999999999999...까지의 랜덤 값 발생
		System.out.println(Math.random());
		//0 <= value < 1
		
		//0 <= value * 10 < 10
		//0 ~ 9.999999... 까지의 랜덤 값 생성
				System.out.println(Math.random()*10);
		
		//int로 형변환시 소수점이 다 날라감
		//0 <= value * 10 < 10 (정수로만)
		//0~9까지의 랜덤 값 발생
		System.out.println((int)(Math.random()*10));
		
		//1~10까지 랜덤값
		//0+1 <= value*10 +1 < 10 + 1 (정수로만)
		//1 <= value*10 + 1 < 11
		//1~10까지의 랜덤 값 생성
		System.out.println((int)(Math.random()*10)+1);
		
		//1~45사이의 랜덤값
		System.out.println((int)(Math.random()*45)+1);
	}

}
