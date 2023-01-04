package object2.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		
		Queue q = new LinkedList(); //shift + f2 Linkedlist가 queue구현
		Stack s = new Stack();
		
		s.push("0");
		s.push("1");
		s.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=stack=");
		while(!s.empty())
			System.out.println(s.pop());
		
		System.out.println("=Queue");
		while(!q.isEmpty())
			System.out.println(q.poll());
		
	}

	
	

}
