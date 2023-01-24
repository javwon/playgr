package ioandStream;
import java.io.*;
import java.util.Arrays;

public class ioexme {

	public static void main(String[] args) {
		try {
		FileInputStream fi = new FileInputStream("c:/Users/User2/Desktop/newone.txt");
		FileOutputStream fo = new FileOutputStream("C:/Users/User2/Desktop/newone2.txt");
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		int data =0;
		byte[] by;
		String s;
		while((data=fi.read())!= -1) {
			fo.write(data);
			bo.write((byte)data);
		}
		by=bo.toByteArray();
		s = fo.toString();
		System.out.println(s);
		System.out.println(Arrays.toString(by));
		fo.flush();
		fo.close();
		
		
		
		
		}catch(Exception e) {e.printStackTrace();}
	}

}


