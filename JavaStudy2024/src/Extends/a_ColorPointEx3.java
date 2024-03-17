package Extends;

public class a_ColorPointEx3 {

	public static void main(String[] args) {
		 a_Point1 p = new a_Point1(); //객체 생성
		 p.set(1, 2);
		 p.showPoint();
		 
		 a_ColorPoint2 cp = new a_ColorPoint2();
		 cp.setColor("orange");
		 cp.set(4, 5);
		 cp.showColorPoint();
	}

}
 