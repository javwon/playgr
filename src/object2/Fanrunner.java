package object2;

public class Fanrunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacture1",0.34567,"green");
		
		fan.switchFan();
		System.out.println(fan);
		fan.switchFan();
		System.out.println(fan);
		fan.setSpeed((byte)5);
		System.out.println(fan);

	}

}
