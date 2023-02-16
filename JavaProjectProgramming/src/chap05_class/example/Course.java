package chap05_class.example;

public class Course {

	//상수는 미리 값을 할당해놓고 사용
	private final String MAJOR = "ComputerScience";
	
	private int cNo; //강의번호
	private String cName; //강의이름
	private int cScore; //학점
	
	//기본 생성자
	public Course() {
		cNo =1;
		cName = "자바";
		cScore = 3;
	}
	
	// 매개변수인 cNo과 멤버변수 cNo은 다른 변수다.
	   // 매개변수 cNo은 생성자 함수를 호출했을 때 보내주는 값으 받기 위한 변수
	public Course(int cNo)
	{
		//this 객체 : 현재 속해있는 클래스를 지칭
		//매개변수로 받아온 cNo과 멤버변수 cNo를 확실하게 구분하기 위해서 this 사용
		this.cNo = cNo;
	}
	
	//매개변수가 두 개인 생성자
	public Course(int cNo, String cName)
	{
		this.cNo = cNo;
		this.cName = cName;
	}
	
	public Course(int cNo, String cName, int cScore)
	{
		this(cNo,cName); // Course 기본생성자 호출 
		// ()안에 넣는 인자에 따라 다른 생성자가 인식됨
		// 매개변수가 두개인 생성자에서 cNo,cName 속성을 초기화해주기 때문에
		// 현재 생성자에서는 따로 초기화 할 필요가 없어진다.
		this.cNo = cNo;
		this.cName = cName;
		this.cScore = cScore;
	}
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public String getMAJOR() {
		return MAJOR;
	}
		
	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcScore() {
		return cScore;
	}

	public void setcScore(int cScore) {
		this.cScore = cScore;
	}
}
