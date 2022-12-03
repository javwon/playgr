package javavideo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class manyclass {
	public static void main(String[] args) {
	Student stu1 = new Student("han",95,98,12,45,46);	
	
	Student stu2 = new Student("adam",97,98);
	
	int num = stu1.getNumberofMarks();
	int sum = stu1.getTotal();
	int maxi = stu1.maximunMark();
	int mini = stu1.minimunnMark();
	BigDecimal average = stu1.getaverage();
	
	System.out.println(num+" "+sum+" "+maxi+ " " + mini+ " " + average);
	
	
	String[] dayOfweek = {"Sunday","Monday","Tuesday","Wednesday","Thutsday","Friday","Saturday"};
	
	String longest=dayOfweek[0];
	for(String a:dayOfweek)
		{if(longest.length()<a.length())
			longest = a;
		}
		System.out.println(longest);
		
		for(int i=0; i<(int)dayOfweek.length/2;i++)
		{String temp = dayOfweek[i]; 
		dayOfweek[i] = dayOfweek[dayOfweek.length-1-i];
		dayOfweek[dayOfweek.length-1-i]=temp;}
	
		
		System.out.println(Arrays.toString(dayOfweek));
		
		System.out.println(stu1);
//		System.out.println(Arrays.toString(stu1.MarksGetter()));
//		stu1.addNewMark(35);
//		System.out.println(Arrays.toString(stu1.MarksGetter()));
//		stu1.removeMarkAtIndex(1);
//		System.out.println(Arrays.toString(stu1.MarksGetter()));
		
		ArrayList me = new ArrayList();
		me.add("hi");
		me.add(1);
		System.out.println(me);
		
		
		mama aa = new mama();
		aa.print();
	
		
		
	}
}