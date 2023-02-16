package chap05_class;

import chap05_class.example.Course;

public class _06_parameterConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course(1, "java", 3);
		System.out.println("과목번호 과목이름 점수");
		System.out.print(course1.getcNo());
		System.out.print(course1.getcName());
		System.out.print(course1.getcScore());
		System.out.println();
		
		Course course2 = new Course(2,"C++",4);
		System.out.print(course2.getcNo());
		System.out.print(course2.getcName());
		System.out.print(course2.getcScore());
		
	}

}
