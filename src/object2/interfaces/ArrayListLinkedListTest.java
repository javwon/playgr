package object2.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayListLinkedListTest {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	public static void main(String[] args) {
	//재밌다 혼자 해보기 
	goURL("1.네이트");
	goURL("2.야후");
	goURL("3.네이버");
	goURL("4.다음");
	
	printStatus();
	
	goBack(); // back에 있는 마지막 꺼내서 forward로 옮김 (후입선출)
	System.out.println("뒤로가기 버튼 누름");
	printStatus();
		
	goBack();
	System.out.println("뒤로가기 버튼 누름");
	printStatus();
	
	goForward(); // forward에 데이터 꺼내서 back으로 옮김
	System.out.println("= 앞으로 가기 버튼 누른후=");
	printStatus();
	
	goForward();
	System.out.println("= 앞으로 가기 버튼 누른후=");
	printStatus();
	
	}
	private static void goForward() {
		back.add(forward.pop());
		
	}
	private static void goBack() {
		forward.add(back.pop());
		
		
	}
	private static void printStatus() {
		System.out.println(back.peek());
		
	}
	private static void goURL(Object s) {
		back.add(s);
		
	}

	
	

}
