package ioandStream;
import java.io.*;
public class ioexpath1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user2\\Desktop\\newone2.txt"); //File 클래스 생성시 /가아닌 \\로생성
		String Filename = f.getName();
		int pos = Filename.lastIndexOf(".");
		
		System.out.println("경로 제외한 파일 명 "+f.getName());
		System.out.println("확장자 제외한 파일 명"+Filename.substring(0,pos));
		System.out.println("확장자"+Filename.substring(pos+1));//시작점 지정해주면 끝까지
		System.out.println("경로 포함 파일이름"+f.getPath());
		System.out.println("파일의 절대경로"+f.getAbsolutePath());
		System.out.println("파일의 정규경로"+f.getCanonicalPath());
		System.out.println("파일이 속한 디렉터리"+f.getParent());
		System.out.println("파일 path Separator"+File.pathSeparator);
		System.out.println("파일 path separator char"+File.pathSeparatorChar);
		System.out.println("file separator"+File.separator);
		System.out.println("file separator char"+File.separatorChar);
		System.out.println("user.dir"+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path"+System.getProperty("sun.boot.class.path"));
		System.out.println();
		System.out.println();

		
		
		
	}

}
