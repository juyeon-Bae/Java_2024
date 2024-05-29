package Test;

import java.util.StringTokenizer;

public class Sum_Ag {

	public static void main(String[] args) {
		 StringTokenizer text = new StringTokenizer("100,90,80,70,60",",");
		 double sum = 0;
		 int cnt = text.countTokens();
		 while(text.hasMoreTokens()) {
			 sum +=Double.parseDouble(text.nextToken());
		 }
		 System.out.println("합계 : " + sum + " 평균 : "+sum/cnt);
	}

}
