
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
public class Exception8_3 {

	public static void main(String[] args) throws Exception {
		
    	BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(b1.readLine());
        BigInteger b = new BigInteger(b1.readLine());
        
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
	}
		
}