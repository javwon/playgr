package object2.interfaces;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PropertyEx2 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: Java PropertiesEx2");
			System.exit(0);
		}
		Properties prop = new Properties();
		String inputFile = args[0];
		
		try {
			prop.load(new FileInputStream(inputFile));
			
		}catch(IOException ex) {
			System.out.println("지정된 파일을 찾을 수 없다");
			System.exit(0);
		}
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		int max =0; 
		int min=0;
		int sum=0;
		
		for(int i=0; i<data.length;i++) {
			int val = Integer.parseInt(data[i]);
			if(i==0) max=min=val;
			
			if(max<val)max=val;
			else if(min>val)min=val;
			
			sum += val;
		}
		System.out.println("이름"+name);
		System.out.println("총점"+Arrays.toString(data));
		System.out.println("최대값"+max);
		System.out.println("최소값"+max);
		System.out.println("합계"+sum);
		System.out.println("평균:"+(sum*100/data.length)/100.0);
	}


}
