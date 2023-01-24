package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ddd {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = {1,2,3,4,4,5,5};
		bw.write(Arrays.toString(arr));
		bw.close();
		
	}

}
