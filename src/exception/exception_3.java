package exception;

public class exception_3 {

	public static void main(String[] args) {
		
		try {
//			Exception e = new Exception("고의발생");
//			throw e;
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("에러 메세지:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
