package javajungsuk.ex;

public class Exercise6_6 {
	public static void main(String[] args) {
		
		System.out.println(getDistance(1,1,2,2));
		
		Mypoint p1= new Mypoint(1,1);
		System.out.println(p1.getDistance(2, 2));
	}
	
	static double getDistance(int x,int y,int x1,int y1) {
		
		
		double deltax=Math.pow(x1-x, 2);
		double deltay=Math.pow(y1-y, 2);
		
		
		return Math.sqrt(deltax+deltay);
	} 
}

class Mypoint{
	
	int x,y;
	Mypoint(int x, int y){this.x=x; this.y=y;}
	
	public double getDistance(int x1, int y1) {
		double deltax=Math.pow(x1-x,2);
		double deltay=Math.pow(y1-y, 2);
		return Math.sqrt(deltax+deltay);
	}
}