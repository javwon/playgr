import java.util.StringJoiner;
public class Exception8_3 {

	public static void main(String[] args) throws Exception{
		int ival = 100;
		String sval = String.valueOf(ival);
		
		double dval = 100;
		String sval2 = String.valueOf(dval);
		
		double sum = Integer.parseInt("-"+sval)+Double.parseDouble(sval2);
		double sum2 = Integer.valueOf("+"+sval)+Double.valueOf(sval2);
		
		System.out.println(String.join("", sval,"+",sval2,"=")+sum);
		System.out.println(sval+"+"+sval2+"="+sum2);
		
}
}
