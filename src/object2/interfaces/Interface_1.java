package object2.interfaces;

public class Interface_1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit2)System.out.println("unit");
		if(f instanceof Fightable)System.out.println("unit");
		if(f instanceof Movable)System.out.println("unit");
		if(f instanceof Attackable)System.out.println("unit");
		if(f instanceof Object)System.out.println("unit");

	}

}
class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {System.out.println("hi");}
	public void attack(Unit2 u) {System.out.println("h");}
}
class Unit2{
	int x;
}
interface Fightable extends Movable, Attackable{}
interface Movable {void move(int x, int y);}
interface Attackable{void attack(Unit2 u);}