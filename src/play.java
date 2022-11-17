import java.util.*;
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
	public int spaceday(String day)
	{
		String[] days = {"su","mo","tu","we","th","fr","sa"};
		int i=0;
		for(;i<days.length;i++)
		{
			if(days[i].equalsIgnoreCase(day))
				break;
		}
		return i;
	}
	public void printSample(int year,int month,String day)
	{	
		
		System.out.printf("    <<%4d%3d>>%n",year,month);
		System.out.println("   일  월   화   수   목   금   토");
		System.out.println(" --------------------");
	
		int maxdayofmonth = maxday(year,month);
		int j =spaceday(day);
		for(int i =1,k=1; i<=maxdayofmonth+j;i++)
		{	if(i<j+1)
			{System.out.printf("%3s"," ");
			}
			else
			{System.out.printf("%3d", k);
			 k++;}
			if(i % 7 ==0)
				System.out.println();
		}

	}


}
