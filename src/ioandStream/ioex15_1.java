package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ioex15_1 {

	public static void main(String[] args) {
		byte[] insrc = new byte[100];
		byte[] outsrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input= null;
		ByteArrayOutputStream output = null;
		
		input =new ByteArrayInputStream(insrc);
		output = new ByteArrayOutputStream();
		int watch;
		try {
			while((watch=input.available())>0) {
				System.out.println(watch);
				int len = input.read(temp); //여기서 temp크기에 맞게
				output.write(temp,0,len);
			}
		}catch(IOException e) {}
		
		outsrc =output.toByteArray();
		
		System.out.println(Arrays.toString(insrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outsrc));
		
		

	}

}
