package Test;

import java.util.StringTokenizer;

public class tokenizer2 {

	public static void main(String[] args) {
		 StringTokenizer text = new StringTokenizer("김하나,99.5,김둘,90.5,김셋,80.5,김넷,70.5,김다섯,60.8",",");
		double sum = 0;
		int cnt = text.countTokens()/2;
		while(text.hasMoreTokens()) {
			String name = text.nextToken();
			double score = Double.parseDouble(text.nextToken());
			sum += score;
			System.out.println(name +" "+ score);
		}
		System.out.println("합계 : " + sum + " 평균 : "+sum/cnt);
		  
	}

}
