package chap05_class;

import chap05_class.example.Course;
import chap05_class.example.Singleton;

public class _09_singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자함수를 호출하지 않았기 때문에 인스턴스화가 되지 않아서
		// 메모리에 객체가 생성되지 않는다.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
		{
			System.out.println("s1과 s2는 같은객체");
		}
		else
		{
			System.out.println("s1과 s2는 다른객체");
		}
		System.out.println("------------------------------");
		
		Course c1 = new Course();
		Course c2 = new Course();
		if(c1 == c2)
		{
			System.out.println("c1과 c2는 같은객체");
		}
		else
		{
			System.out.println("c1과 c2는 다른객체");
		}
		
		//같은 객체를 바라보기 때문에 s1의 전역변수a값을 변경해도
		//s2도 a값이 바뀐 상태의 객체를 바라보게 된다.
		s1.a = 10;
		s2.status();
	}

}
