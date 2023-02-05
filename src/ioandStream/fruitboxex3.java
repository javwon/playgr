package ioandStream;

class Jucie{
	String name;
	Jucie(String name) {this.name = name+"Jucie";}
	public String toString() {return name;}
}
class Jucier{
	static Jucie makeJucie(FruitBox<? extends Fruit1>box) {
		String tem ="";
		for(Fruit1 f: box.getList())
			tem += f+" "; //
		return new Jucie(tem);
	}
	
	
}


public class fruitboxex3 {
	 public static void main(String[] args) {
		 FruitBox<Fruit1> fbox = new FruitBox<>();
		 FruitBox<Apple1> abox = new FruitBox<>();
		 
		 fbox.add(new Apple1());
		 fbox.add(new Grape1());
		 abox.add(new Apple1());
		 abox.add(new Apple1());
		 System.out.println(Jucier.makeJucie(fbox));
		 System.out.println(Jucier.makeJucie(abox));
		 
		 
	 }
}
