package object2.interfaces;

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] fly = new Flyable[] {new Bird(),new Airplane()};
		
		for(Flyable a:fly)
			a.fly();
		
	}
}

interface Flyable{
	void fly();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("with wings");
	}
	
}
class Airplane implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("with fuel");
	}
	
}
