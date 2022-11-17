
public class play {
	private static final int[] MONTH_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] MONTH_DAYS2 = {31,29,31,30,31,30,31,31,30,30,31,31};
	
	public boolean isLeapYear(int year) {
		if (year %4 == 0 && (year %100 !=0|| year %400 ==0))
			return true;
		else
			return false;
	}
	public int maxday(int year,int month)
	{
		if (isLeapYear(year)) 
			return MONTH_DAYS2[month-1];
		else
			return MONTH_DAYS[month-1];
	}


	public void printSample(int year,int month,int day)
	{	
		
		System.out.printf("    <<%4d%3d>>%n",year,month);
		System.out.println("   일  월   화   수   목   금   토");
		System.out.println(" --------------------");
		
		for(int i=0;i<day;i++)
		{
			System.out.printf("   ");
		}
		
		int maxdayofmonth = maxday(year,month);
		int count =7-day; //시작라인 숫자 맞춰주려고함 출력갯수
//		int delim = (count < 7)? count:0;
		//print first line
		for(int i=1;i<=count;i++)
		{
			System.out.printf("%3d",i);
		}
		System.out.println();
		//print second line
		for(int i =count+1; i<=maxdayofmonth;i++)
		{	
			System.out.printf("%3d", i);
			 
			if((i-count) % 7 ==0) //다른방법으론 나머지가 count만큼 되도록 설정
				System.out.println();
		}

	}


}
