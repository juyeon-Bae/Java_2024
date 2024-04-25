package Extends;

public class Drawing {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw(); // Circle의 draw() 메소드로 감
		Shape s = c; //업캐스팅
		s.draw(); // Shape의 draw()메소드로 가지만 동적 바인딩 발생-> Circle의 draw()메소드로 간다

	}

}
