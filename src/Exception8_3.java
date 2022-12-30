import static java.math.BigDecimal.*;
import java.math.MathContext;
import static java.math.RoundingMode.*;
import java.util.*;
import java.math.*;
public class Exception8_3 {

	

	public static void main(String[] args) throws Exception{
		BigDecimal bd1 = new BigDecimal("123.456"); 
		BigDecimal bd2 = new BigDecimal("1.0"); 

		System.out.print("bd1="+bd1);
		System.out.print(",\tvalue="+bd1.unscaledValue());
		System.out.print(",\tscale="+bd1.scale());		 
		System.out.print(",\tprecision="+bd1.precision());
		System.out.println();

		System.out.print("bd2="+bd2);
		System.out.print(",\tvalue="+bd2.unscaledValue());
		System.out.print(",\tscale="+bd2.scale());		 
		System.out.print(",\tprecision="+bd2.precision());
		System.out.println();

		
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3="+bd3);
		System.out.print(",\tvalue="+bd3.unscaledValue());
		System.out.print(",\tscale="+bd3.scale());		 
		System.out.print(",\tprecision="+bd3.precision());
		System.out.println();

		System.out.println(bd1.divide(bd2, 1)); // 123.46
		System.out.println(bd1.setScale(4));    // 123.46
		System.out.println(bd1.divide(bd2, new MathContext(4, HALF_UP)));
	
}	
	

}
