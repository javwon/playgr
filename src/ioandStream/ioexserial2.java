package ioandStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class ioexserial2 {

	public static void main(String[] args) {
		try {
			String filename = "Userinfo2.ser";
			FileInputStream fis = new FileInputStream(filename);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			Userinfo2 u1 = (Userinfo2)in.readObject();
			Userinfo2 u2 = (Userinfo2)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			Userinfo2 u3=null;
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			
			
			in.close();
			
			
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
