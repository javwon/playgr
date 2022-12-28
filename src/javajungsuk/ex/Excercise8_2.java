package javajungsuk.ex;

public class Excercise8_2 {

	public static void main(String[] args) {
		int a=0;
		try {
			 a=method1();
		}catch(Exception e) {
			System.out.println("main에서 처리");
		}
		System.out.println(a);
	}

	 static int method1() throws Exception {
		try {
			System.out.println("mehod1 호출");
			method2();
			
			
			
			
		}catch(Exception e) {
			System.out.println("method1에서 예외 처리");
			
			throw e;
		}
		finally {
			System.out.println("finally 실행");
		}
		return 1;
	}

	private static void method2() throws Exception{
		int n = (int)(Math.random()*2);
		if(n != 0) throw new Exception();
		
	}

}
