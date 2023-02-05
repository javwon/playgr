package javajungsuk.ex;

enum Direction {EAST,SOUTH,WEST,NORTH}

public class Excercise12_5 {

	public static void main(String[] args) {
		//찐기본사용법
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1 == d2 ?"+(d1==d2));
		System.out.println("d1 == d3 ?"+(d1==d3));
		System.out.println("d1.equals(d3) ?"+(d1.equals(d3)));

		System.out.println("d1.compareTo(d3)?"+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2)?"+(d1.compareTo(d2)));
		
		switch(d1) {
		
		case EAST: System.out.println("the direction is East"); break;
		case SOUTH: System.out.println("the direction is south"); break;
		case WEST: System.out.println("the direction is west"); break;
		case NORTH: System.out.println("the direction is NORTH"); break;
		
		
		}
		Direction[] darr = Direction.values();
		
		for(Direction d :darr) {
			System.out.println(d.name()+d.ordinal());
		}
		
		
		
		
		
		
	
	}
	


}
