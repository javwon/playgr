package object2.interfaces;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet sett = new HashSet();
		sett.add(new Personn("David",10));
		sett.add(new Personn("David",10));
		
		System.out.println(sett);
	}

}

class Personn{
	String name;
	int age;
	
	Personn(String name, int age){this.name =name; this.age=age;}
	
	public String toString() {
		return name+" : "+age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Personn) {Personn temp=(Personn)obj;
		
		return this.name.equals(temp.name) && this.age==temp.age;}
		return false;
		} 
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	}
	
