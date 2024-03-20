package Extends;

public class Upcasting {

	public static void main(String[] args) {
		Person p = new Student("이재문","123"); //업캐스팅: 서브클래스 객체를 슈퍼 클래스 타입으로 타입 변환
//		Person p;
//		Student s = new Student("juyeon","123");
//		p=s;
		System.out.println(p.name +", "+ p.id);
		Student s= (Student)p; //다운캐스팅 : 슈퍼클래스 객체를 서브 클래스 타입으로 변환
		
		s.grade="1";
		System.out.println(s.grade);
		 
		

	}

}
