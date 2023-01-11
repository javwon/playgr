package javajungsuk.ex;

import java.util.ArrayList;
import java.util.Iterator;


public class Excercise11_15 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0;i<10;i++)original.add(""+i);
		
		Iterator lit = original.iterator();
		
		//앞으로 가면서 카피
		while(lit.hasNext())copy1.add(lit.next());
		//재사용 불가라서 다시 얻어와야한다.
		lit = original.iterator();
		while(lit.hasNext()) {copy2.add(lit.next());
		lit.remove();}
		System.out.println(original);
		System.out.println(copy1);
		System.out.println(copy2);
	}

}
