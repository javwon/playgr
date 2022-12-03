package javavideo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class manyrun {
	public me bb = new me();
	public int a =10;
	protected int aaa =11;
}

class Student 
{	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	Student(){}
	Student(String name, int...a){
		
		this.name = name;
		//배열에 내용 arrayList로 옮기기
		for(int mar : a)
			this.marks.add(mar);
	}
	public int getNumberofMarks() {return marks.size();}
	public int getTotal()
	{	int total =0;
	for(int a: this.marks)
		total += a;
	return total;
	}
	public int maximunMark()
	{
		
		return Collections.max(marks);
	}
	public int minimunnMark()
	{
	
		return Collections.min(marks);
	}
	
	public BigDecimal getaverage() {
		
		int sum = getTotal();
		int number = getNumberofMarks();
		BigDecimal avar = new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);//새로우ㅠㄴ것
		
		return avar;
	}
	
	
	
	public void addNewMark(int a)
	{
		marks.add(a);
	}
	
	public void removeMark(int a)
	{
		marks.remove(a);
	}
	//object클래스의..
	public String toString() {
		StringBuffer val = new StringBuffer();
		for(int i=0; i<this.marks.size();i++)
			{val.append(marks.get(i));
			}
		
		String valu = val.toString();
		return valu;
			}
	//배열 그냥 고쳐주기 헷
//	public void addNewMark(int a) 
//	{	//this() 이용해서 add랑 remove가능 할 듯하다 그거 생각해봐
//		int[] temp = new int[marks.length+1];
//		System.arraycopy(marks, 0, temp, 0, marks.length);
//		temp[marks.length] = a;
//		this.marks = temp;
//	}
//	
//	public void removeMarkAtIndex(int a)
//	{	
//		
//		for(int i=0; i<marks.length-1;i++)
//		{
//			if(i>=a)
//			{
//				int temp = marks[i];
//				marks[i] =marks[i+1];
//				marks[i+1] = temp;
//			}
//		}
//		
//		int[] temp = new int[marks.length-1];
//		for(int i=0; i<marks.length-1;i++)
//			temp[i] = marks[i];
//		
//		marks = temp;
//	}
//	public int[] MarksGetter() {return this.marks;}
	
}
class me{
	
	protected int th;
	int b =10;
	me(){this(1);}
	me(int a){this.th=a;}
}

class mama extends me{
	int a = 10;
	
	
	
	void print() {
		
		System.out.println(this.a);
		System.out.println(super.th);
	}
}




