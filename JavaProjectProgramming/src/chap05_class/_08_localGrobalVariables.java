package chap05_class;

import chap05_class.example.Operation;
import chap05_class.example.Singleton;

public class _08_localGrobalVariables {
	//전역 변수
	 int num1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		
		//지역변수 result2는 add메소드가 종료되면 사라지기 대문에
		//기존에 연산됐던 값도 함께 삭제된다.
		System.out.println("1 + 2 = " + op.add(1, 2));
		System.out.println("3 + 4 = " +op.add(3,4));
		
		System.out.println("0 + 3 = " + op.add(3));
		//전역변수로 선언된 result1은 
		//객체가 삭제되기 전까지는 바뀐 값인 3으로 계속 존재한다
		System.out.println("3 + 4 = " + op.add(4));
		//이제 result1 은 7로 저장된 상태
	}

}
