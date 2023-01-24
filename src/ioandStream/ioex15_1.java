package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ioex15_1 {

	public static void main(String[] args) {
		byte[] insrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outsrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input= null;
		ByteArrayOutputStream output = null;
		
		input =new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		try {
			while(input.available()>0) {
				int len = input.read(temp);
				output.write(temp,0,len);
			}
		}catch(IOException e) {}
		
		outsrc =output.toByteArray();
		
		System.out.println(Arrays.toString(insrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outsrc));
		
		

	}

}
