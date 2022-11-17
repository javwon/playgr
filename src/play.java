import java.util.*;
public class play {
	private static final int[] MONTH_DAYS = {31,28,31,30,31,30,31,31,30,30,31,31};
	public int maxday(int i)
	{
		return MONTH_DAYS[i-1];
	}
	public void printSample()
	{
		System.out.println(" 일  월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
	}
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		play Max_days = new play();
		String Prompt ="cal > ";
		
		while(true)
		{	
		
		System.out.println("달을 입력하세요(-1이면 종료)");
		System.out.print(Prompt);
		int month = scanner.nextInt();
		if(month>=1 && month <=12)
		{
		System.out.printf("%d월은 %d일까지 있습니다 %n",month,Max_days.maxday(month));
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

}
