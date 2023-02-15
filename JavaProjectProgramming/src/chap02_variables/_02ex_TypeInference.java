package chap02_variables;

public class _02ex_TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		System.out.println(str);
		
	//	str = 3; var타입이 string타입으로 지정되었기 때문에 int 타입으로의 변환이 불가
		
	}

}
