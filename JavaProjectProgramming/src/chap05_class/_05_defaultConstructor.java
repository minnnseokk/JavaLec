package chap05_class;

import chap05_class.example.Course;
import chap05_class.example.Student;

public class _05_defaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course();
		
		System.out.println("강의 번호는 : " + course.getcNo());
		System.out.println("강의 제목은 : " + course.getcName());
		System.out.println("학점은 : " + course.getcScore());;
		
		System.out.println("----------------------------------");
		
		// 다른 패키지의 클래스는 임포트된 상태에서 사용 
		// 임포트 단축키 (ctrl + shift + o)
		
		// 기본생성자를 정의하지 않고 매개변수가 있는 생성자를 정의하게 되면
		// 기존에 제공되던 기본 생성자를 사용할 수 없고 따로 정의를 해줘야된다.
		// 매개변수가 있는 생성자를 정의할 때는 기본 생성자도 함께 정의해준다.
		
		Student student1 = new Student();
		Student student2 = new Student();

		//같은 객체를 2개 이상 생성하면 각각 다른 heap메모리 공간에 각각 생성
		//같은 객체라고 같은 메모리 공간의 하나의 객체를 사용하지 않는다.
		System.out.println(student1);
		System.out.println(student2);
		System.out.println("----------------------------------");

		
		// 기본 생성자에서 속성 값을 초기화 하지 않을 경우 int는 0으로 초기화
		// String은 null로 초기화
		System.out.println("학번은 : " + student1.getsNo());
		System.out.println("학생 이름은 : " + student1.getsName());
		System.out.println("취득 평점은 : " + student1.getGrade());
		System.out.println("----------------------------------");
		
		//setter 메소드를 이용한 속성 값 설정
		student1.setsNo(1);
		student1.setsName("정민석");
		student1.setGrade("A");
		//student1과 student2는 같은 객체이지만 정보는 각각의 공간에 저장된다.
		//속성 값 설정 후 출력
		System.out.println("학번은 : " + student1.getsNo());
		System.out.println("학생 이름은 : " + student1.getsName());
		System.out.println("취득 평점은 : " + student1.getGrade());
		System.out.println("----------------------------------");
		System.out.println("학번은 : " + student2.getsNo());
		System.out.println("학생 이름은 : " + student2.getsName());
		System.out.println("취득 평점은 : " + student2.getGrade());
		System.out.println("----------------------------------");
		
				 			
		
	}
	

}
