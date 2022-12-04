package object2.interfaces;

public abstract class Animalab {
	void bark() {};
}

class Dog extends Animalab{
	
	void bark() {
		System.out.println("bpw Bow");
	}
}

class Cat extends Animalab{
	
	void bark() {
		System.out.println("Mew MEw");
	}
}