package ioandStream;
import java.io.*;
public class ioex7 {

	public static void main(String[] args)  {
		try{String path = "C:/Users/user2/Desktop/test123.txt"; //반대작대기
		//FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos,5);
		for(int i='1';i<='9';i++) {bos.write(i);}
		
		fos.close();
		}catch(IOException e) {e.printStackTrace();}
	}

}
