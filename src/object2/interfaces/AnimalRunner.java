package object2.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {
		Animalab[] animal = {new Dog(),new Cat()};
		
		for(Animalab a: animal)
			a.bark();
	}

}





