package chap06_array;

public class _06_deepCopyArray {
	// 교재 211p
	public static void main(String[] args) {
		//1. clone() 메소드를 이용한 깊은 복사
		int[] arr1 = { 1, 2, 3, 4, 5};
		
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1[0] = 10;
		arr2[0] = 30;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		//2. System.arraycopy() 메소드를 이용한 깊은 복사
		//arraycopy(복사될 원본 배열이름, 복사를 시작할 인덱스,
		//			복사해서 사용할 배열이름, 복사할 배열을 넣을 인덱스)
		int[] arr3 = new int[5];
		//6개의 공간을 가진 arr3 생성
		//arr1의 내용을 arr3에 arr1의 갯수만큼 붙여넣는다.
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		System.out.println(arr1);
		System.out.println(arr3);
		
		arr1[1] =13;
		arr3[1] = 16;
		
		System.out.println(arr1[1]);
		System.out.println(arr3[1]);
		
		
	}

}
