
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
	public int findactualday(int total)
	{
		if(total == 0)
			return 6;
		else return total-1;
		
	}
	
	public int find_Lep_year (int year)
	{
		return ((int)((year-1)/4)-(int)((year-1)/100)+(int)((year-1)/400));
	}
	
	public int findofday(int year, int month)
	{	int[] arr = isLeapYear(year) ? MONTH_DAYS2:MONTH_DAYS;
		//평년 합 윤년 합 구하기 기준년도는 1583년
		int year_discount = year-1583;
		int Lep_year = find_Lep_year(year) - find_Lep_year(1583);
		int nomar_year = year_discount - Lep_year;
		//해당년도 1월1일이 몇 요일인지 나온다. 토요일 기준
		int total_count = (nomar_year + (Lep_year*2)) % 7;
		//해당 년도가 정확히 몇요일인지 나오는 것 
		int counter =findactualday(total_count);
		
		int year_month_sum=0;
		
		for(int i=0;i<(month-1);i++)
		{
			year_month_sum += arr[i];
		}
		
		return (counter+(year_month_sum))%7;
	}
	
	public void printSample(int year,int month)
	{	
		
		System.out.printf("    <<%4d%3d>>%n",year,month);
		System.out.println("   일  월   화   수   목   금   토");
		System.out.println(" --------------------");
		
	
		int maxdayofmonth = maxday(year,month);
		int counter = findofday(year,month);
		
		for(int i=0;i<counter;i++)
		{
			System.out.printf("%3s"," ");
		}
		
		//print second line
		for(int i =1; i<=maxdayofmonth;i++)
		{	
			System.out.printf("%3d", i);
			 
			if((i+counter) % 7 ==0) //다른방법으론 나머지가 count만큼 되도록 설정
				System.out.println();
		}

	}


}
