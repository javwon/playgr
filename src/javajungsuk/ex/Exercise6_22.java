package javajungsuk.ex;

public class Exercise6_22 {
	
	public static void main(String[] args) {
	String str = "123";
	System.out.println(str+"는 숫자입니까?"+isNumber(str));
	
	str = "12s34";
	System.out.println(str+"는 숫자입니까?"+isNumber(str));
	
}

	private static boolean isNumber(String str) {
		char[] temp = str.toCharArray();
		boolean result=true;
		
	isNumber:
		for(char a:temp)
		{
			if(!(a>='0' && a<='9'))
			{
				result=false;
				break isNumber;
			}
				
		}
		
		
		return result;
	}
}
