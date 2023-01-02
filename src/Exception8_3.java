
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Exception8_3 {

	//배울점 있다.
		 public static void main(String[] args) throws IOException {
		  BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		  String input = b1.readLine();
		  short n = Short.parseShort(input);
		  double[] score = new double[n];
		  input = b1.readLine();
		  StringTokenizer sz = new StringTokenizer(input," ");
		 
		  //입력 값으로 배열 만들기
		  int i=0;
		  while(sz.hasMoreTokens()) {
			 
			  score[i++] = Short.parseShort(sz.nextToken());
		  }
//		  for(short i =0; i<sz.countTokens();i++) { 이놈은 잘 안된다.
//			  score[i]=Short.parseShort(sz.nextToken());
//		  }
		 System.out.println(newAver(score));
			 
		      
		 }
		 static double newAver(double[] score) {
			
			 short max_score =0;
			 double sum=0;
			 for(double x:score)
			 {if(max_score<x)
				 max_score=(short)x;
			 }
			 for(short x=0; x<score.length;x++)
				 {score[x]=score[x]/max_score*100;
				 	sum+=score[x];
				 }
			 
			 return sum/score.length;
		 }
}