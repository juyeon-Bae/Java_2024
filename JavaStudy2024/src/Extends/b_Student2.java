package Extends;

public class b_Student2 extends b_Person1{
	public void set() {
		//멤버 변수 초기화
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99;
		setWeight(99); //private이므로 setWeight으로 초기화 시켜줌
	}

	public void printStudent() {
		 System.out.println("나이 : "+age); 
		 System.out.println("키 : "+height); 
		 System.out.println("몸무게 : " + getWeight());  // 초기화시킨 값을 반환
		 System.out.println("이름 : "+name); 
		 
	}
}
