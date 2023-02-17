package chap06_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = new char[26];
		for(int i = 0; i < chArr.length; i++)
		{
			char ch = 'A';
			//i = 0, chArr[0] = A 
			//i = 1, chArr[1] = B
			//...
			//i = 25, chArr[25] = Z
			chArr[i] = (char)(ch + i);
		}
		for(int i = 0; i< chArr.length; i++)
		{
			System.out.println(chArr[i]);
			//소문자로 변환하여 출력
			System.out.println("변환됨 " +(char)(chArr[i] + 32));
		}
	}

}
