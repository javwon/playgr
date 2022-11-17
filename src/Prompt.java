import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal >";
	
	public void runPrompt(){
		Scanner scanner =new Scanner(System.in);
		play Max_days = new play();
		Scanner ds = new Scanner(System.in);
		while(true)
		{	
		System.out.println("\n년도를 입력하세요");
		System.out.print(PROMPT);
		int year = scanner.nextInt();
		System.out.println("\n달을 입력하세요(-1이면 종료)");
		System.out.print(PROMPT);
		int month = scanner.nextInt();
		
		System.out.println("\n 시작하는 날짜를 입력하세요");
		System.out.print(PROMPT);
		String day = ds.nextLine();
		
		if(month>=1 && month <=12)
			
		{
			Max_days.printSample(year,month,day);
		}
		else if (month == -1)
			break;
		else
			continue;
		}
		System.out.println("bye~");
//		Max_days.printSample();
		scanner.close();
		ds.close();
	}
	
	public static void main(String[] args) {
		
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
		
	}

}
