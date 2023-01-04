package object2.interfaces;

import java.util.Stack;

public class exStatckremove {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("1");
		s.push("0");
		s.push("2");
		
		while(!s.empty())
			System.out.println(s.pop());
	
		
	}

}
