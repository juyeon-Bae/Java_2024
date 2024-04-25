package API;

public class StringBuffeMethods {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java ");
		StringBuffer sb2 = new StringBuffer("programmer");
		StringBuffer sb3 = new StringBuffer("I Love");
		
		sb2 = sb1.append(sb2);
		System.out.println(sb2);
		
		sb1.replace(1,3,"AVA");
		System.out.println(sb1.append(" "+sb2));
		
		sb3.reverse();
		System.out.println(sb3);

	}

}
