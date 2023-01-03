package object2.interfaces;

import java.util.Vector;

public class Vectior_1 {

	public static void main(String[] args) {
		Vector a = new Vector(10);
		//아..각 클래스에서 equlas.......불러오겠군아
		a.add(new Person("jang_won"));
		
		Vector b = new Vector(10);
		b.add(new Person("jang_wo"));
		System.out.println(a.equals(b));
		//일단 사이즈와 용량 확인하기 ->각 엘리먼트가 같은 위치에 (같은 클래스 인지 확인 1번) 같은 클래스로 같은 값인지 확인하기(이건 각 클래스에게)
		System.out.println(b.get(0).getClass());
	}

}
class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	
	public boolean equals(Object a) {
		if(a instanceof Person)
		{
			if(this.name.equals(((Person)a).name)) return true;
		}
		return false;
	}
}
