package Test;
import java.util.*;

public class Tokenizer {

	public static void main(String[] args) {
		
		StringTokenizer text = new StringTokenizer("99.5,90.5,80.5,70.5,60.8",",");
		double sum = 0;
		int len = text.countTokens();
		while(text.hasMoreTokens()) {
			String a = text.nextToken();
			sum +=Double.parseDouble(a);		 
	}
		System.out.println("합계 : " + sum + " 평균 :" + sum/len);
	}
}
