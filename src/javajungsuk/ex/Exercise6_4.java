package javajungsuk.ex;

public class Exercise6_4 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name="홍길동";
		s.ban = 1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		Student s1 = new Student("홍길동",1,1,100,60,76);
		
		System.out.println("이름 :"+s.name);
		System.out.println("총점 :"+s.getTotal());
		System.out.println("평균 :"+s.getAverage());
		System.out.println(s1.info());
	}

}

class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){};
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban = ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String info() {
		return String.format("%s,%d,%d,%d,%d,%d %d, %.1f", this.name,this.ban,this.no,this.kor,this.eng,this.math,getTotal(),getAverage());
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	public float getAverage() {
		return Math.round(getTotal()*10/3f)/10f;
	}
	
}