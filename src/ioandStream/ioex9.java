package ioandStream;
import java.io.*;
import java.util.Arrays;
public class ioex9 {

	public static void main(String[] args) {
		ByteArrayOutputStream bs;
		DataOutputStream dos;
		byte[] temp;
		try {
			bs = new ByteArrayOutputStream();
			dos = new DataOutputStream(bs);
			
			dos.write(10);
			dos.writeFloat(20.f);
			dos.writeBoolean(true);
			
			temp = bs.toByteArray();
			String[] hex = new String[temp.length];
			
			for(int i=0; i<temp.length;i++) {
				if(temp[i]<0) {
					hex[i] = String.format("%02x", temp[i]+256);
				}else {
					hex[i] = String.format("%02x", temp[i]);
				}
			}
			System.out.println("10진수: "+Arrays.toString(temp));
			System.out.println("16진수 :"+Arrays.toString(hex));
			dos.close();
		}catch(IOException e) {e.printStackTrace();}
	}

}
