package ioandStream;
import java.io.*;
public class ioex10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int score=0;
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
			 fis = new FileInputStream("C:/Users/user2/Desktop/sample.dat");
			 dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum +=score;	
				}
		}catch(EOFException e) {
			System.out.println("점수 총합"+sum);
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(dis!=null)dis.close();
			}catch(IOException ie) {ie.printStackTrace();}
			
		}	
	
	
		
	}
}
