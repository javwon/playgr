package ioandStream;
import java.io.*;
public class ioex17 {

	public static void main(String[] args) {
		try {
			FileOutputStream fio = new FileOutputStream("C:/Users/user2/Desktop/newone2.txt",true);
			PrintStream po = new PrintStream(fio);
			System.setOut(po);
			
		}catch(IOException e) {System.err.println("파일이 없어요");}
		System.out.println("hello by System.out");
		System.err.println("hello by System.err");
	}

}
