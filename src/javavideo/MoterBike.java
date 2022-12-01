package javavideo;

public class MoterBike {
	
	private int speed; //다른클래스에서 이 인스턴스 변수에 직접접근 못하고, 메써드 사용해야함 //member variable
	
	
	void start() {System.out.println("Bike Start");}
	

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
	}
	//increase와 decrease검증
	public void increaseSpeed(int howmuch)
	{	setSpeed(this.speed+howmuch);
	}
	
	public void dcreaseSpeed(int howmuch)
	{	setSpeed(this.speed-howmuch);
	}

	MoterBike(int speed){this.speed = speed;}
	MoterBike(){this(0);}
	
	
}
class book {
	private int noofcopies;
	
	void setcopies(int no) 
	{
		this.noofcopies =no;
	}
	public void inceaseCopies(int howmuch) {
		setcopies(this.noofcopies+howmuch);
	}
	public void decreaseCopies(int howmuch) {
		setcopies(this.noofcopies-howmuch);
	}
	
	book(int noof){this.noofcopies = noof;}
	book(){this(1000);}
}
