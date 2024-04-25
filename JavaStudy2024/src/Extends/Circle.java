package Extends;

public class Circle extends Shape{
	private String type = "원";
	public void draw() {
		System.out.println(type+ "그리기");
	}
	public void painting() {
		System.out.println("색칠하기");
	}
}
