package Test;
import java.util.*;

public class Tokenizer {

	public static void main(String[] args) {
		
		StringTokenizer text = new StringTokenizer("99.5,90.5,80.5,70.5,60.8",",");
		 //합계, 평균
		double sum = 0;
		int cnt = text.countTokens();
		while(text.hasMoreTokens()) {
			sum += Double.parseDouble(text.nextToken());
		}
		System.out.println("합계 : "+sum +" 평균 : "+ sum/cnt);
	}
}
