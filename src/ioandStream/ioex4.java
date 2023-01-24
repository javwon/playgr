package ioandStream;


import java.io.*;
import java.util.Arrays;

public class ioex4 {

	public static void main(String[] args) {
		byte[] insrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outsrc = null;
		byte[] temp  = new byte[4];
		
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output =null;
		
	
		
		input = new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		System.out.println("input source"+Arrays.toString(insrc));
		
		
		try {
			while(input.available() >0) {
				input.read(temp);
				output.write(temp);
				//System.out.println("temp: "+Arrays.toString(temp));
				outsrc = output.toByteArray();
				printArrays(temp,outsrc);
			}
		}catch(IOException e) {}

		

	}
	static void printArrays(byte[] temp, byte[] outsrc) {
		System.out.println("temp: "+Arrays.toString(temp));
		System.out.println("output source "+Arrays.toString(outsrc));
	}

}


