package Interface;

 interface PhoneInterface { // 인터페이스 : 클래스가 구현해야 할 메소드들이 선언되는 추상형
	 final int TimeOut = 10000; // 상수 필드 선언 : 그대로 사용하고 오버라이딩이 안됨
	 void sendCall(); // 추상 메소드
	 void receiveCall(); // 추상 메소드
	 default void printLogo() { // default : 오버라이딩 X
		 System.out.println("** Phone **");
		 printLogo2(); // private로 접근
	 }
	 
	 private void printLogo2() { // private main에서 쓸 수 없음
		 System.out.println("** Phone2 **");
	 }
	 
	 public static void printIntro() {
		 System.out.println("인트로");
	 }
	 }

