package ioandStream;
import java.io.*;
public class ioex10 {

	public static void main(String[] args) {
	int[] score = {100,90,95,85,80};
	
	try {
		FileOutputStream fos = new FileOutputStream("C:/Users/user2/Desktop/sample.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		for(int i=0; i<score.length;i++) {
			dos.writeInt(score[i]);
		}
		dos.close();
	}catch(IOException e) {e.printStackTrace();}
		
	}

}
