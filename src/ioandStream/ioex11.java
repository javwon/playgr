package ioandStream;
import java.io.*;



public class ioex11 {

	public static void main(String[] args) {
	  try {
		  FileReader fr = new FileReader("C:/Users/user2/Desktop/newone2.txt");
		  FileInputStream fis = new FileInputStream("C:/Users/user2/Desktop/newone2.txt");
		  FileWriter fw = new FileWriter("C:/Users/user2/Desktop/test.txt");
		  
		  int data =0;
		  while((data = fis.read())!= -1) {
			  System.out.print((char)data);
			  fw.append((char)data);
		  }
		  System.out.println();
		  fis.close();
		  
		  
		  while((data = fr.read()) != -1)
			  {System.out.print((char)data);
			  if(data != '\t'&&data!= '\n'&&data!= ' '&&data != '\r')
			  fw.append((char)data);}
		  fr.close();
		  fw.close();
	  }catch(IOException e) {e.printStackTrace();}
	}

}
