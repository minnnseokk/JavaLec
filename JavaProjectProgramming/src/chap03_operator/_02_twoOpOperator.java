package chap03_operator;

public class _02_twoOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대입연산자
		int a = 10;
		int b = 6;
				
		//2. 산술연산자
		int num1 = 30;
		int num2 = 7;
		int result;
		
		result = num1 + num2; // 37
		System.out.println("num1 + num2 = " + result);
		result = num1 - num2; // 23
		System.out.println("num1 - num2 = " + result);
		result = num1 * num2; // 210
		System.out.println("num1 * num2 = " + result);
		result = num1 / num2; // 4
		System.out.println("num1 / num2 = " + result);
		result = num1 % num2; // 2
		System.out.println("num1 % num2 = " + result);
		System.out.println("--------------------------");
		
		// 3. 복합대입연산자
		int num3 = 10;
		int num4 = 3;
		
		num3 += num4; // 13
		System.out.println("num3 += num4 " + num3);
		
		num3 -= num4; // 13 - 3 = 10
		System.out.println("num3 -= num4 " + num3);
		
		num3 *= num4; // 10 * 3 = 30
		System.out.println("num3 *= num4 " + num3);
		
		num3 /= num4; // 30 / 3 = 10
		System.out.println("num3 /= num4 " + num3);
		
		num3 %= num4; // 10 % 3 = 1
		System.out.println("num3 %= num4 " + num3);
		System.out.println("--------------------------");

		// 4. 관계연산자
		int num5 = 100;
		int num6 = 300;
		boolean result2;
		result2 = num5 <num6;
		System.out.println("num5 < num6 = " + result2); //true
		
		result2 = num5 >num6;
		System.out.println("num5 > num6 = " + result2); //false
		
		result2 = num5 <=num6;
		System.out.println("num5 <= num6 = " + result2); //true
		
		result2 = num5 >=num6;
		System.out.println("num5 >= num6 = " + result2); //false
		
		result2 = num5 ==num6;
		System.out.println("num5 == num6 = " + result2); //false
		
		result2 = num5 !=num6;
		System.out.println("num5 != num6 = " + result2); //true
		System.out.println("--------------------------");
		
		// 5. 논리연산자
		boolean result3;
		
		result3 = 43>=81 && 62 < 99;
		System.out.println("43 >= 81 && 62 < 99 = " + result3);
		
		result3 = false || num3 == (num4 / 3);
		System.out.println("false || num3 == (num4 / 3) = " + result3);
		// result3이 거짓이거나 num3가 num4/3의 결과값일경우 true
		// 둘다 거짓된 결과가 나오면 false
		System.out.println("!result3 = " + !result3); //false
	}

}
