package ioandStream;
import java.io.*;
import java.util.Arrays;
import java.util.Vector;
public class ioex12 {

	public static void main(String[] args) {
		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		byte[] arr4 = {9};
		byte[] output = null;
		
		Vector v1 = new Vector();
		v1.add(new ByteArrayInputStream(arr1));
		v1.add(new ByteArrayInputStream(arr2));
		v1.add(new ByteArrayInputStream(arr3));
		v1.add(new ByteArrayInputStream(arr4));
		SequenceInputStream si = new SequenceInputStream(v1.elements());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] temp =new byte[4];
		try {
			for(int i=0; i<v1.size();i++) {
				int len = si.read(temp);
				bos.write(temp,0,len);
			}
			
		}catch(IOException ie) {}
		output = bos.toByteArray();
		System.out.println(Arrays.toString(output));
	}

}
