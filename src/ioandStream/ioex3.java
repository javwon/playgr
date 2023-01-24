package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ioex3 {

	public static void main(String[] args) {
		byte[] insrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outsrc = null;
		byte[] temp  = new byte[10];
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output =null;
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp,0,temp.length);
		output.write(temp,5,5);
		
		outsrc = output.toByteArray();
		
		System.out.println(Arrays.toString(insrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outsrc));
		

	}

}
