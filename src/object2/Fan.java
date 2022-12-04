package object2;

public class Fan {
	private String make;
	private double radius;
	private String color;
	//생성자 만들때 처음에 초기화 해야할 부분과 아닌 부분 구별
	private boolean inOn;
	private byte speed;
	
	Fan(){}
	Fan(String make, double radius, String color){
		this.make = make;
		this.radius =radius;
		this.color = color;
		
	}
	//isOn
	
	public void switchFan()
	{
		if(this.inOn == false) {
			this.inOn=true;
			setSpeed((byte)1);
		}
		else {
			this.inOn = false;
			setSpeed((byte)0);}
	}
	
	public void setSpeed(byte speed) {
		if(speed >=0 && speed <= 5)
		this.speed = speed;
		else System.out.println("0이상 5이하를 입력하세요");}
	
	public String toString() {
		return String.format("make - %s,radius -%f,color - %s,isOn- %b,speed - %d",make,radius,color,inOn,speed);
		//Stirng.fromat 잘 봐두자..
	}
}
class Rectangle{
	private int length;
	private int width;
	Rectangle(){}
	Rectangle(int length,int width){
		this.length= length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
