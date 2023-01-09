package object2.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		ListIterator i = a.listIterator(); //일회용 
		while(i.hasNext()) 
			{Object obj = i.next();
				System.out.println(obj);
			}
		//i = a.listIterator(); //다시 읽으려면 다시 이터레이터로 받아와야함
		while(i.hasPrevious()) System.out.println(i.previous());
		//next를 한번 해줘야 previous가 있다. 처음받아오고 previous하면 아무것도 안나옴
		
		
		//i.forEachRemaining(System.out::println); //람다식 이용하는 메서드이다.
		//while문 입니다요
		
		
		//그냥 갑자기 생각나서 한것 
		StringTokenizer s = new StringTokenizer("나 는 모 야"," ");
		String s1="";
		String s2 ="";
		String s3 ="";
		String s4 ="";
		
		String[] input = "meemem".split("e");
		
		System.out.println(Arrays.toString(input));
		while(s.hasMoreTokens())
		{
			s1 =s.nextToken();
			s2 = s.nextToken(); //하나씩 꺼냅니다.
			s3 = s.nextToken();
			s4 = s.nextToken();
		}
		System.out.println(s1+s2+s3+s4);
		
	}
	

}
