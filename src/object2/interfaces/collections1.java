package object2.interfaces;

import java.util.ArrayList;

public class collections1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 기본길이 10인 객체 배열
		list1.add("111");
		list1.add("222");
		list1.add("333");
		list1.add("222"); //중복요소 추가가능(객체배열)
		list1.add(333); // list.add(new Integer(333)); <-오토박싱
		System.out.println(list1);
		
		list1.add(0,"000");
		System.out.println(list1);
		
		System.out.println("index ="+list1.indexOf("333"));
		list1.remove("333");
		
		for(int i=0; i<list1.size();i++)
			{list1.set(i, i+""); //객체를 새로운 객체로 바꾸기 (문자열로 바꾸고 있다)
			list1.get(i);
			}
		
		for(int i=list1.size()-1;i>=0;i--)
			list1.remove(i);
		System.out.println(list1); //거꾸로 돌려야 모두 삭제됨
	}

}
