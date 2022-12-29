import java.util.StringJoiner;
public class Exception8_3 {

	public static void main(String[] args) throws Exception{
	String str = "가";
	
	byte[] arrb = str.getBytes("UTF-8");
	byte[] arrd = str.getBytes("CP949");
	
	System.out.println("utf-8 :" + joinBytes(arrb));
	System.out.println("utf-8 :" + joinBytes(arrd));
	
	String arrb1 = new String(arrb,"UTF-8");
	String arrd1 = new String(arrd,"CP949");
	
	System.out.println(arrb1+arrd1);
	}
	
	static String joinBytes(byte[] arr) {
		StringJoiner ie = new StringJoiner(":","[","]");
		
		for(byte a : arr) {
			ie.add(String.format("%02x", a));
		}
		return ie.toString();
	}

}

