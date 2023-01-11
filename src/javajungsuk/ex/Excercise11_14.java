package javajungsuk.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Excercise11_14 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		for(int i=1; i<6;i++)list.add(""+i);
		
		
		ListIterator it = list.listIterator();
		
		//앞으로가기 
		while(it.hasNext())System.out.println(it.next());
		System.out.println();
		//뒤로가기
		while(it.hasPrevious())System.out.println(it.previous());

	}

}
