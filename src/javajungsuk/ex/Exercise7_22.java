package javajungsuk.ex;

public class Exercise7_22 {

	public static void main(String[] args) {
		Shape[] cir1 = {new Circle(3,2,5),new Rectangle(5,6)};
		System.out.println(cir1[0].getPosition());
		System.out.println(cir1[1].getPosition());
		System.out.println(cir1[1].calcArea());
		System.out.printf("%.2f%n",cir1[0].calcArea());
		System.out.println(cir1[0]);
		System.out.println(cir1[1]);
	}

}
abstract class Shape{
	Point p;
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){this.p=p;}
	
	abstract double calcArea();
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
	
}

class Point{
	int x;
	int y;
	Point (){
		this(0,0);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}
class Circle extends Shape{
	double r;
	Circle(){
		this(0,0,1.0);
	}
	Circle(int x, int y, double r){
		super(new Point(x,y));
		this.r =r;
	}
	double calcArea() {
		return r*r*Math.PI;
	}
	public String toString() {
		return super.p+""+this.r;
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(){
		this(1,1);
	}
	Rectangle(int x, int y)
	{
		super(new Point(x,y));
		this.width=super.p.x;
		this.height=super.p.y;
	}
	
	double calcArea() {
		return width*height;
	}
	boolean isSquare() {
		return (this.height==this.width)? true:false;
	}
	public String toString() {
		return "weight :"+super.p.x+" height :"+super.p.y;}
}
