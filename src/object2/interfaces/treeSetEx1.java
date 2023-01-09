package object2.interfaces;

import java.util.TreeSet;
import java.util.*;
public class treeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new nameComparotr()); //중복값 허용x
		set.add(100); // set.add(new Integer(100)); //이건 객체 생성 
		set.add(50);	
		set.add(70);
		set.add(80);
		set.add(new Student2());
		
		System.out.println(set);
	}

}
class nameComparotr implements Comparator{
	public int compare(Object a, Object b) {
		if(a instanceof Student2 && b instanceof Student2)
		{	Student2 t1 = (Student2)a;
			Student2 t2 = (Student2)b;
			return t1.name.compareTo(t2.name);
			
		}
		return -1;
	}
}


class Student2 //implements Comparable{
{
	String name="jang";
	int score=50;
	
	public int compareTo(Object obj) {
		if(obj instanceof Student2) {
			Student2 temp = (Student2)obj;
			return Integer.valueOf(score).compareTo(Integer.valueOf(((Student2) obj).score));
			//static 메서드는 알아서 객체 생성해서 반환..
		}
		return -1;
	}
	
	public String toString() {
		return name+":"+score;
	}

	
	
}