package javavideo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class manyrun {
	
}

class Student 
{	private String name;
	private int[] marks;
	Student(){}
	Student(String name, int...a){
		
		this.name = name;
		this.marks= a;
	}
	public int getNumberofMarks() {return marks.length;}
	public int getTotal()
	{	int total =0;
	for(int a: this.marks)
		total += a;
	return total;
	}
	public int maximunMark()
	{
		int maxval=this.marks[0];
		for(int a: this.marks)
		{
			if(maxval<a)maxval=a;
		}
		return maxval;
	}
	public int minimunnMark()
	{
		int minval=this.marks[0];
		for(int a: this.marks)
		{
			if(minval>a)minval=a;
		}
		return minval;
	}
	
	public BigDecimal getaverage() {
		
		int sum = getTotal();
		int number = getNumberofMarks();
		BigDecimal avar = new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);//새로우ㅠㄴ것
		
		return avar;
	}
}

