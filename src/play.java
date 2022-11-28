
public class play {
	private static final int[] MONTH_DAYS = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] MONTH_DAYS2 = {0,31,29,31,30,31,30,31,31,30,30,31,31};
	
	public boolean isLeapYear(int year) {
		if (year %4 == 0 && (year %100 !=0|| year %400 ==0))
			return true;
		else
			return false;
	}
	public int maxday(int year,int month)
	{
		if (isLeapYear(year)) 
			return MONTH_DAYS2[month];
		else
			return MONTH_DAYS[month];
	}
	
	
	public void printSample(int year,int month)
	{	
		
		System.out.printf("    <<%4d%3d>>%n",year,month);
		System.out.println("   일  월   화   수   목   금   토");
		System.out.println(" --------------------");
		
		int day =getday(year,month,1);
		
		int maxdayofmonth = maxday(year,month);
		int count = 7 - day;
		int delim = (count <7)? count:0;
		
		for(int i=0;i<day;i++)
		{
			System.out.print("   ");
		}
		//print first line 
		for(int i=1; i<=count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		count++;
		//print second line
		for(int i =count; i<=maxdayofmonth;i++)
		{	
			System.out.printf("%3d", i);
			 
			if(i % 7 ==delim) //다른방법으론 나머지가 count만큼 되도록 설정
				System.out.println();
		}

	}
	
	private int getday(int year, int month, int day) {
		
		//기준날짜 요일 알아내기 1970 1월 1일 
		int syear = 1970;

		final int sweekday = 4;//목요일
		
		int count =0;
		//년 더하기 
		for(int i= syear;i<year;i++)
		{
			int delta = isLeapYear(i) ? 366:365;
			count += delta;
		}
		//월 더하기 
		for(int i = 1; i<month; i++)
		{
			int delta = maxday(year,i);
			count += delta;
		}
		//남은 날짜 더하기
		count += day-1;
		int weekday = (count+sweekday) %7; //목요일이 기준요일이므로.. 며칠 지났는지가 궁금한게 아니라
		//몇 요일인지가 궁금한것 따라서 0->3 목요일임 4(1+3) 목요일 +1 이런식으로 생각하는 것 
		return weekday;
	}


}
