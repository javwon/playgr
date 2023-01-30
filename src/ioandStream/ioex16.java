package ioandStream;
import java.io.*;
public class ioex16 {

	public static void main(String[] args) {
		String inputData = "it is a Data";
		StringReader sr = new StringReader(inputData);
		StringWriter sw = new StringWriter();
		String Outputdata = null;
		int data =0;
		
		/*int data =0;
		try {
			while((data=sr.read())!= -1)sw.write(data);
	
		}catch(IOException e) {}
		finally {sr.close(); 
		          try{sw.close();}catch(IOException e){e.printStackTrace();}	}
		
		System.out.println(inputData);
		System.out.println(sw.toString());
		System.out.println(sw.getBuffer().toString());*/
		
		try {
			FileReader fr = new FileReader("C:/Users/user2/Desktop/newone.txt");
			while((data = fr.read()) != -1) {
				sw.write((char)data);
			}
			Outputdata = sw.toString()+"moe moe";
			sr = new StringReader(Outputdata);
			while((data = sr.read())!= -1)sw.write((char)data);
			
			fr.close();
		}catch(IOException e) {e.printStackTrace();}
		finally {
			sr.close();
			try{sw.close();}catch(IOException e) {e.printStackTrace();}
			
			System.out.println(sw.toString());
		}
	}
	

}
