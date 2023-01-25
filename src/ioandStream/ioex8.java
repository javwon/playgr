package ioandStream;
import java.io.*;

public class ioex8 {

	public static void main(String[] args)  {
		String path = "C:/Users/user2/Desktop/sample.dat";
		try{FileOutputStream fo = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fo);
		
		dos.write(10);
		dos.writeFloat(20.0f);
		dos.writeBoolean(true);
		dos.close();
		
		}catch(IOException e) {e.printStackTrace();}
	}

}
