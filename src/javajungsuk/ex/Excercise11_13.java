package javajungsuk.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Excercise11_13 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=1; i<6;i++)list.add(""+i);
		
		Collection a = list;
		Iterator it = a.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
