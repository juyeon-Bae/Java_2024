package Extends;

public class c_cp2 extends c_Points1{
	private String color;
	public c_cp2(int x, int y, String color) {
		super(x,y); //Point1의 매개변수 호출, super생성시 생성자 코드의 제일 첫 라인에 와야 함
		this.color = color;
	}
	
	public void ShowP() {
		System.out.println(color);
		show();
	}
}
