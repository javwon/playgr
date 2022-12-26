package exception;

public class exception_1 {

	public static void main(String[] args) {
	int number =100;
	int result = 0;
	for(int i=0; i<10; i++) {
		try{result = number / (int)(Math.random()*10); //ArithmeticException처리
			System.out.println(result);}
		catch(ArithmeticException e) {
			System.out.println("0");
	}
	}
	
	}

}
