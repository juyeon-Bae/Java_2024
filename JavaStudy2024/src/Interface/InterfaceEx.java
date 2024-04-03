package Interface;

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		PhoneInterface.printIntro();
		System.out.println("상수 : "+ PhoneInterface.TimeOut);
	}

}
