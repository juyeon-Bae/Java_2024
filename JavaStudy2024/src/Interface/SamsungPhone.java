package Interface;

public class SamsungPhone implements PhoneInterface{ // 인터페이스 구현 : implements
	public void sendCall() { // 추상 메소드 오버라이딩
		System.out.println("띠리리리링");
	}
	public void receiveCall() { // 추상 메소드 오버라이딩
		System.out.println("전화가 와습니다.");
	}
	
	public void flash() { // 메소드 추가 작성
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
