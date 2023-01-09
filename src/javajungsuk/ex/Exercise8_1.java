package javajungsuk.ex;
import java.io.*;
public class Exercise8_1 {

	public static void main(String[] args) {
	
		try {
			File f = createFile(new String("파일명"));
			System.out.println(f.getName()+"파일이 정상적으로 생성됨");
		}catch(Exception e) {
			System.out.println("다시 입력해주세요");
		}
			
	
			
	}
	static File createFile(String filename) throws Exception{
		if(filename == null || filename.equals("")) {
			throw new Exception("문제발생");
		}
		File f = new File(filename);
		createNewFile(f);
		return f;
	}
	static void createNewFile(File f) throws Exception {
		f.createNewFile();
		System.out.println("what?");
	}

}





