package javavideo;

public class MoterBikerunner {

	public static void main(String[] args) {
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		ducati.start();
		honda.start();
		
		ducati.setSpeed((short)100);
		//중복제거 public method
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		//speed를 올리는 기본적인 로직
		int ducatiSpeed = ducati.getSpeed();
		ducatiSpeed += 100;
		ducati.setSpeed((short)ducatiSpeed);
		
		int hondaSpeed = honda.getSpeed();
		hondaSpeed += 100;
		honda.setSpeed((short)hondaSpeed);
		
		
		book artofComputerProgramming = new book();
		book EffectiveJava = new book();
		book clean_code = new book();
		artofComputerProgramming.setcopies(100); 
		EffectiveJava.setcopies(150); 
		clean_code.setcopies(50);
	}

}
