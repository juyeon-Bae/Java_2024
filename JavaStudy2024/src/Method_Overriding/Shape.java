package Method_Overriding;

public class Shape {
	public Shape next;
	public Shape() {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
