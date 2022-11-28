package javavideo;

public class ch6_mian {

	public static void main(String[] args) {
		ch6_28min m = new ch6_28min();
		
		m.Multiplication(6); //컨트롤 클릭하면 어디있는건지 찾을 수 있음
	}

}
//연습으로 만들기
class MotorBike {
	
	float velocity;
	String name;
	String color;
	int location;
	int num;
	
	static int SNum =0;
	static int gear =5;
	{
		SNum ++;
		num = SNum;
	}
	
	MotorBike(String name, String color, float velocity){
		this.name = name;
		this.color = color;
		this.velocity = velocity;
		location = 1;
		
	}
	MotorBike(){
		this("hite","blue",50f);
	}
	
	void setgear(int gear_set) {gear= gear_set;}
	void setvel(float velocity) {this.velocity=velocity;}
}