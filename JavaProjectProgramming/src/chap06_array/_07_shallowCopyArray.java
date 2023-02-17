package chap06_array;

public class _07_shallowCopyArray {
	// 교재 213p
	public static void main(String[] args) {
		int[] arr1 = { 1,2,3,4,5};
		//얕은복사
		//arr1은 배열에 대한 주소 값이 담겨 있으므로
		//arr2에 arr1 주소 값이 복사되어 드렁간다.
		int[] arr2 = arr1;
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1[0] = 11;
		arr2[0] = 1000;
		
		//arr2의 값을 arr1이 따라가게됨
		System.out.println(arr1[0]);
		System.out.println(arr2[0]); 
	}

}
