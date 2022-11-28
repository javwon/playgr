package javavideo;

public class MoterBike {
	
	private short speed; //다른클래스에서 이 인스턴스 변수에 직접접근 못하고, 메써드 사용해야함 //member variable
	
	
	void start() {System.out.println("Bike Start");}
	

	public short getSpeed() {
		return speed;
	}


	public void setSpeed(short speed) {
		System.out.println(speed);
		System.out.println(this.speed);
		this.speed = speed;
	}


}
class book {
	private int noofcopies;
	
	void setcopies(int no) 
	{
		this.noofcopies =no;
	}
}
