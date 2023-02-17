package chap05_class.example;

public class DistanceChanger {
	// 변환할 거리 long(m)
	// 변환할 단위(cm, mm, km, inch)
	// 기본 생성자
	// 생성자(거리와 단위) = > 멤버변수 초기화
	// 선택된 단위로 거리를 변환해서 출력하는 메소드
	private long distance;
	private String unit;

	public DistanceChanger() {
	}

	public DistanceChanger(long distance, String unit) {
		this.distance = distance;
		this.unit = unit;
	}

	// 단위별 변환하기
	public void changeUnit() {
		switch (unit) {
		case "cm":
			System.out.println(unit + "로 변환된 값 : " + (distance * 100) + unit);
			break;
		case "mm":
			System.out.println(unit + "로 변환된 값 : " + (distance * 1000) + unit);
			break;
		case "km":
			System.out.println(unit + "로 변환된 값 : " + ((double) distance / 1000) + unit);
			break;
		case "inch":
			System.out.println(unit + "로 변환된 값 : " + ((double) distance / 39.37) + unit);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

}
