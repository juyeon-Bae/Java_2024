package Extends;

public class a_ColorPoint2 extends a_Point1 {
	 private String color;
	 public void setColor(String color) {
		 this.color = color;
	 }
	 public void showColorPoint() {
		 System.out.println(color);
		 showPoint();
	 }
}
