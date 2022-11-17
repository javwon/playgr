import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal >";
	
	public void runPrompt(){
		Scanner scanner =new Scanner(System.in);
		play Max_days = new play();
		
		while(true)
		{	
		
		System.out.println("달을 입력하세요(-1이면 종료)");
		System.out.print(PROMPT);
		int month = scanner.nextInt();
		
		if(month>=1 && month <=12)
		{Max_days.printSample(2022,month);
		System.out.printf("%n %d월은 %d일까지 있습니다 %n",month,Max_days.maxday(month));
		}
		else if (month == -1)
			break;
		else
			continue;
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
