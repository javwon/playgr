package javajungsuk.ex;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Vector;

public class Excercisewithbj {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[30];
		int[] notsubmit = new int[2];
		
		
		
		for(int i=0; i<28;i++) 
		{	arr[Integer.parseInt(br.readLine())-1] =1;
		 
		}
		for(int i=0;i<30;i++) {
			if(arr[i] != 1) {
				if(notsubmit[0] ==0)notsubmit[0] =i+1;
				else notsubmit[1] = i+1;
			}
		}
		Arrays.sort(notsubmit);
		
		
		bw.write(notsubmit[0]+""+"\n");
		bw.write(notsubmit[1]+"");
		
		
		bw.flush();
		bw.close();

	}

}
