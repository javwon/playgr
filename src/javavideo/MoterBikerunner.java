package javavideo;

public class MoterBikerunner {

	public static void main(String[] args) {
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		ducati.start();
		honda.start();
		
		ducati.setSpeed((short)100);
//		honda.setSpeed((short)10);
//		System.out.println(ducati.getSpeed());
//		System.out.println(honda.getSpeed());
		
		
		
		book artofComputerProgramming = new book();
		book EffectiveJava = new book();
		book clean_code = new book();
		artofComputerProgramming.setcopies(100); 
		EffectiveJava.setcopies(150); 
		clean_code.setcopies(50);
	}

}
