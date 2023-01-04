package object2.interfaces;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayListLinkedListTest {
	
	public static void main(String[] args) {
	Stack st = new Stack();
	String expression = "(2+3)*1";
	
	System.out.println("expression:" +expression);
	
	try {
		for(int i=0; i<expression.length();i++) {
			char ch = expression.charAt(i);
			if(ch=='(') {
				st.push(ch+"");
			}else if(ch==')') {
				st.pop();
			}
		}
			if(st.isEmpty())System.out.println("괄호일치");
			else System.out.println("괄호 불일치");
		
	}catch(EmptyStackException e) {System.out.println("괄호 일치 안합니다");}
	
	
	
	
	
	
	}

		
		
	

	
	

}
