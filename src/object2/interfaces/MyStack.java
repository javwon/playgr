package object2.interfaces;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Vector;

public class MyStack {

	public static void main(String[] args) {
		
		Stack a = new Stack();
		a.push(1);
		a.push(2);
		a.push(3);
		
		System.out.println(a.search(3));
	}

}
class MySt extends Vector{
	
	public Object push(Object b) {
		super.addElement(b);
		return b;
	}
	public Object pop() {
		Object obj =peek();
		super.removeElement(super.size()-1);
		return obj;
	}
	public Object peek() {
		int len =size();
		if(len ==0) throw new EmptyStackException();
		else return super.elementAt(len-1);
		
	}
	public boolean empty() {
		return size()==0;
	}
	public int search(Object o) {
		int i = lastIndexOf(o);//끝에서부터 객체를 찾음 
		if(i>=0) {return size()-i;} // stack은 맨위에 저장된 객체 index가 1이다. 0,1,2 순서로 저장 2를 찾으면, 1이나옴 (size()3-lastindex(2))
		return -1;
	}
	
	
	
}
