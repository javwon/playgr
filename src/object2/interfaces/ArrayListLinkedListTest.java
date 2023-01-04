package object2.interfaces;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ArrayListLinkedListTest {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	public static <E> void main(String[] args) {
	System.out.println("help를 입력하시면 도움말을 봅니다.");
	
	while(true) {
		System.out.print(">>");
		try {
			//화면으로부터 라인단위 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			if("".equals(input))continue;
			
			if(input.equalsIgnoreCase("q"))System.exit(0);
			else if(input.equalsIgnoreCase("help")) {
				System.out.println("help - 도울말을 보여줌");
				System.out.println("q 또는 Q- 프로그램종료");
				System.out.println("history - 최근 입력 명령어를 "+MAX_SIZE+" 개 보여줍니다.");
			}
			else if(input.equalsIgnoreCase("history")) {
				int i=0;
				save(input);
				//Linked list의 내용을 보여줌
				LinkedList temp = (LinkedList)q;
				ListIterator<E> it = temp.listIterator();
				while(it.hasNext())System.out.println(++i+"."+it.next());
			}else {
				save(input);
				System.out.println(input);
			}
			}catch(Exception e) {System.out.println("입력오류입니다.");}
		}
	}
	private static void save(String input) {
		if(!"".equals(input))q.offer(input);
		if(q.size()>MAX_SIZE)q.remove(); //q에서 poll은 제일 처음 들어간것, remove는 제일 처음에 들어간것
		//statck이랑 pull,pop방향만 다른거지 remove같은건 다를 이유가 있나?
		//쌓는건 같은 방향임 뭐가 먼저 나오냐 차이 마지막 vs처음 
		//아 remove()와 poll()은 queue에 메서드 비어있을때 행동만 차이 (선입선출 같음)
	}
	
	
	
	
	
	
	}

		
		
	

	
	


