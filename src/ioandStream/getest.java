package ioandStream;
import java.util.ArrayList;


class Fruit1 implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple1 extends Fruit1{ public String toString(){return "apple";}}
class Grape1 extends Fruit1{ public String toString(){return "Grape";}}
class Toy1 { public String toString(){return "Toy";}}

interface Eatable{}

public class getest {
	


	public static void main(String[] args) {
		
		FruitBox<Fruit1> fbox = new FruitBox<Fruit1>();
		FruitBox<Apple1> abox = new FruitBox<Apple1>();
		FruitBox<Grape1> gbox = new FruitBox<Grape1>();
		//FruitBox<Toy1> tbox = new FruitBox<Toy1>();
		
		fbox.add(new Fruit1());
		fbox.add(new Apple1());
		fbox.add(new Grape1());
		abox.add(new Apple1());
		gbox.add(new Grape1());
		
		System.out.println(fbox);
		System.out.println(abox);
		System.out.println(gbox); 
		

	}

	
}
class FruitBox<t extends Fruit1 & Eatable> extends box<t> {}

class box<t>{
	ArrayList<t> list = new ArrayList<>();
	void add(t item) {list.add(item);}
	t get(int i) {return list.get(i);}
	ArrayList<t> getList(){return list;}
	int size(){return list.size(); }
	public String toString(){return list.toString();}
	
}