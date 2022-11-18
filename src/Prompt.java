import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal >";

	public void runPrompt(){
		Scanner scanner =new Scanner(System.in);
		play Max_days = new play();
		int year=0;
		int month =-1;
		
		while(true)
		{	
		System.out.println("\n년도를 입력하세요(-1 종료)");
		System.out.print(PROMPT);
		year = scanner.nextInt();
		if(year == -1)break;
		System.out.println("\n달을 입력하세요(-1이면 종료)");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		

		if(month>=1 && month <=12)
			
		{
			Max_days.printSample(year,month);
		}
		
		else {
			System.out.println("잘못 된 입력입니다.");
			continue;
		}
		}
		System.out.println("bye~");
//		Max_days.printSample();
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
		
	}

}
