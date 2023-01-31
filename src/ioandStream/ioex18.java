package ioandStream;
import java.io.*;
public class ioex18 {

	public static void main(String[] args) {
		try{RandomAccessFile raf = new RandomAccessFile("C:/Users/user2/Desktop/newone2.txt","rw");
		
		System.out.println("파일 포인터의 위치 :"+raf.getFilePointer());
		raf.write(100);
		System.out.println("파일 포인터의 위치 :"+raf.getFilePointer());
		raf.write(100);
		System.out.println("위치 :"+raf.getFilePointer());
		}catch(IOException e) {e.printStackTrace();}
	}

}
