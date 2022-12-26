package exception;

public class exception_2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		}
		catch(ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
			}
			e.printStackTrace();
			System.out.println("예외 메세지 :"+e.getMessage());
			System.out.println(5);
			}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);

	}

}
