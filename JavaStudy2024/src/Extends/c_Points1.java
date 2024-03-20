package Extends;

public class c_Points1 {
	private int x,y;
	public c_Points1() { //생성자를 객체의 클래스이름과 동일시한다
		this.x = this.y = 0; //기본값을 0으로 설정
	}
	
	public c_Points1(int x, int y) {
		this.x=x; 
		this.y=y;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")");
	}
}
