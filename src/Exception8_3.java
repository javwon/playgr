
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Exception8_3 {

	
		 public static void main(String[] args) throws IOException {
		   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		   String input = bf.readLine();
		   StringTokenizer sz = new StringTokenizer(input," ");
		   int x = Integer.parseInt(sz.nextToken());
		   int y = Integer.parseInt(sz.nextToken());
		   int w = Integer.parseInt(sz.nextToken());
		   int h = Integer.parseInt(sz.nextToken());
		   
//		   BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));
//		   sw.write(x);
		   System.out.println(dis(x,y,w,h));
//		   sw.flush();
//		   sw.close();
		      
		 }
		 static int dis(int x, int y, int w, int h) {
			 short po1;
			 short po2;
			 //점 두개만 두고 비교할 것 x가 중간보다 크거나 작다.
			 if(x<=(int)(w/2))
			 {
				 po1 = (short)x;
				 //y가 중간보다 크거나 작다.
				 if(y<=(int)(h/2)) {
					 po2 = (short)y;
				 }
				 else po2=(short)(h-y);
				 
				 return (po1<po2) ? po1:po2; //둘 중 작은 값 리턴
			 }
			 else {
				 po1 = (short)(w-x);
				 
				 if(y<=(int)(h/2)) {
					 po2 = (short)y;
				 }
				 else po2=(short)(h-y);
				 return (po1<po2) ? po1:po2;
			 }
			 
		 }
		  
		  
		}