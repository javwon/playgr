package object2;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private String author;
	
	private Reviews[] rie = new Reviews[0];
	
	private ArrayList<Reviews> re = new ArrayList<>(); //어레이 리스트 다루기 
	
	static int counter = 0;
	Book(){}
	Book(int id, String name, String author){
		this.id=id;
		this.name = name;
		this.author=author;
	}
	public void addReview(Reviews a) {
		counter++;
		Reviews[] temp = new Reviews[counter];
		System.arraycopy(rie, 0, temp, 0, rie.length);
		temp[temp.length-1]=a;
		rie = temp;
	}
	//여기..편하게 가자! 
	public void addRevi(Reviews re) {this.re.add(re);}
	
	
	public String toString() {
		
		String result ="id - "+id+" name - "+name+" author - "+author;
		
		for(Reviews a: rie)
			result += a.toString();
		
		return result;
	}
}
