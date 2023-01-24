package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ioex2 {

	public static void main(String[] args) {
		byte[] intsrc = {0,1,2,3,4,5,6,11,8,9};
		byte[] outsrc = null;
		
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(intsrc);
		output = new ByteArrayOutputStream();
		int data =0;
		
		while((data = input.read())!= -1) {
			output.write(data);
		}
		
		
		outsrc = output.toByteArray();
		
		System.out.println(Arrays.toString(intsrc));
		System.out.println(Arrays.toString(outsrc));
	}

}
