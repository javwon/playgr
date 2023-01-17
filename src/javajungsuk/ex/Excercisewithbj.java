package javajungsuk.ex;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.Vector;

public class Excercisewithbj {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numarr;
		int max=0;
		int min=0;
		
		int numofcount = Integer.parseInt(br.readLine());
		String[] inputLine = br.readLine().split(" ");
		numarr = new int[numofcount];
		
		for(int i=0; i<numofcount;i++) {
			numarr[i] = Integer.parseInt(inputLine[i]);
			
			if(i==0) {
				min = numarr[i];
				max= numarr[i];
			}
			else {
			max = numarr[i]>max? numarr[i]:max;
		    min = numarr[i]<min? numarr[i]:min;
		    }
		}
		bw.write(min+" "+max);
		
		
		
		bw.flush();
		bw.close();

	}

}
