package vector;
import java.util.Vector;
public class PointEx {

	public static void main(String[] args) {
		// point객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();
		
		//3개의 point객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); //인덱스 1의 point(-5,20) 객체 삭제
		
		//벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); //백터에서 i번째 Point 객체 얻어내기
			System.out.println(p); //p to String()을 이용한 객체 p 출력
		}
	}

}
