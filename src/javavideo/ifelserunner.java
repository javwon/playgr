package javavideo;
import java.util.*;
public class ifelserunner {

	public static void main(String[] args) {
		
	
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number1: ");
//		int number1 = scanner.nextInt();
//		System.out.println("Enter number2: ");
//		int number2 = scanner.nextInt();
//		
//		ifelse.printChoice();
//		
//		System.out.println("Enter choice: ");
//		int choice = scanner.nextInt();
//		System.out.println("your choices are: "+choice);
//		
//		scanner.close();
		
		String someString ="This is a lot of text again";
		for(int i=0; i< someString.length();i++)
			System.out.println(someString.charAt(i));
		
		for(char a: someString.toCharArray())
			{if(a==' ')continue;
			System.out.println(a);
			}
		
		StringBuilder sb =new StringBuilder("hi");
		
	}
	

		
}
