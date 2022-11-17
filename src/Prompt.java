import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal >";
	public int parseDay(String day)
	{	
		
		if(day.equals("su"))
			return 0;
		else if (day.equals("mo"))return 1;
		else if (day.equals("tu"))return 2;
		else if (day.equals("we"))return 3;
		else if (day.equals("th"))return 4;
		else if (day.equals("fr"))return 5;
		else if (day.equals("sa"))return 6;
		else return 0;
	}
	public void runPrompt(){
		Scanner scanner =new Scanner(System.in);
		play Max_days = new play();
		int year=0;
		int month =-1;
		int day =0;
		while(true)
		{	
		System.out.println("\n년도를 입력하세요(-1 종료)");
		System.out.print(PROMPT);
		year = scanner.nextInt();
		if(year == -1)break;
		System.out.println("\n달을 입력하세요(-1이면 종료)");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		
		System.out.println("\n 시작하는 날짜를 입력하세요");
		System.out.print(PROMPT);
		String days = scanner.next(); //next line으로 하면 에러 났었는데 next로 해결가능할까?
		day=parseDay(days);
		
		if(month>=1 && month <=12)
			
		{
			Max_days.printSample(year,month,day);
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
