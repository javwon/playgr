package object2.interfaces;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("autosave", "5");
		p.setProperty("language","한글");
		p.setProperty("timeout", "10");

		
		System.out.println(p);
		
		System.out.println(p.getProperty("autosave","0"));
		
		p.list(System.out); //한번에 잘 보여줌
		
		//Properties의 장점은 파일에 저장하고 읽는게 쉽다.
		
		try { //파일 입출력이 편해서 property 잘 사용합니다.
			p.load(new FileInputStream("output.txt"));
			System.out.println(p);
			
			p.store(new FileOutputStream("output.txt"), "Properties");
			//파일에 Properties 내용 저장하는 것 한글 쓰고 싶으면 xml형식으로 저장해라
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
