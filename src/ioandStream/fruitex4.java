package ioandStream;
import java.util.*;

class Fruit{
	String name;
	int weight;
	
	Fruit(String name , int we){
		this.name = name;
		this.weight= we;
	}
	public String toString() {return name+"("+weight+")";}
	
}
class Apple extends Fruit{
	Apple(String name, int we){
		super(name,we);
	}
}
class Grape extends Fruit{
	Grape(String name, int we){
		super(name,we);
	}
}
class AppleComp implements Comparator<Apple>{
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}
class GrapeComp implements Comparator<Grape>{
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}
class FruitComp implements Comparator<Fruit>{
	public int compare(Fruit t1, Fruit t2) {
		return t2.weight - t1.weight;
	}
}

public class fruitex4 {

	public static void main(String[] args) {
		FruitBox1<Apple> fbox = new FruitBox1<>();
		FruitBox1<Grape> gbox = new FruitBox1<>();
		
		fbox.add(new Apple("GreenApple",300));
		fbox.add(new Apple("GreenApple",100));
		fbox.add(new Apple("GreenApple",200));
		
		gbox.add(new Grape("GreenGrape",400));
		gbox.add(new Grape("GreenGrape",300));
		gbox.add(new Grape("GreenGrape",200));
		
		Collections.sort(fbox.getList(), new AppleComp());
		Collections.sort(gbox.getList(), new GrapeComp());
		System.out.println(fbox);
		System.out.println(gbox);
		Collections.sort(fbox.getList(), new FruitComp());
		Collections.sort(fbox.getList(), new FruitComp());
		System.out.println(fbox);
		System.out.println(gbox);

	}

}
class FruitBox1<t extends Fruit> extends box<t> {}

class box1<t>{
	ArrayList<t> list = new ArrayList<>();
	void add(t item) {list.add(item);}
	t get(int i) {return list.get(i);}
	ArrayList<t> getList(){return list;}
	int size(){return list.size(); }
	public String toString(){return list.toString();}
	
}
