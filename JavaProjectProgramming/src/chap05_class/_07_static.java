package chap05_class;

import chap05_class.example.Student;

public class _07_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 상관없이 사용할 수 있는 static 키워드
		// static 멤버변수 사용
		System.out.println(Student.MAJOR);
		System.out.println(Student.school);
		// System.out.println(Student.sNo); 
		// static 키워드로 생성되지 않은 멤버변수는 객체 생성후 사용 가능
		
		// static 메서드 호출
		Student.majorInfo();
		Student.schoolInfo();
		
		Student student = new Student();
		student.studentInfo();
		// 객체가 생성되지 않은 상태로 호출하여 에러 발생
		// 해결1. 변수를 사용하는 클래스의 생성자와 관련된 것 모두 static으로 선언하기
		// Student 클래스 => public 'static' studentInfo(){}
		// 해결2. 해당 변수를 쓰기위한 생성자를  생성
		// Student(클래스) student(변수이름) = new(공간할당) Student();
		
	}

}
