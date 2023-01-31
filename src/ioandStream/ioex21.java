package ioandStream;
import java.io.*;
public class ioex21 {

	public static void main(String[] args) {
		int sum =0;
		try {RandomAccessFile raf = new RandomAccessFile("Score2.dat","r");
		   int i=4;
			while(true) {
			   raf.seek(i);
			   sum += raf.readInt();
			   i+=16;
		   }
		
		
		}catch(EOFException e) {
			System.out.println("sum :"+sum);
		}catch(Exception ee) {ee.printStackTrace();}
	}

}
