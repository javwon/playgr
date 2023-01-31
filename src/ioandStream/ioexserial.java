package ioandStream;
import java.io.*;
import java.util.ArrayList;
public class ioexserial {

	public static void main(String[] args) {
		try {
			String filename = "Userinfo2.ser";
			FileOutputStream fos = new FileOutputStream(filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);//3개짬뽕 file-buffer이용-객체전달
			
			Userinfo2 u1 = new Userinfo2("Javaman","1234",30);
			Userinfo2 u2 = new Userinfo2("javawoman","4321",26);
			
			ArrayList<Userinfo2> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화 완료");
			
			
		}catch(IOException e) {e.printStackTrace();}

	}

}
