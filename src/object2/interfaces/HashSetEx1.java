package object2.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","4","3"};
		Set set = new HashSet();
		
		for(int i=0; set.size()<6;i++) //중복저장 x
			set.add((int)(Math.random()*45+1));
		
		//Collections.sort(set);//List를 구현한 컬렉션만 sort가능
		List s1 = new LinkedList(set); 
		List s2 = new ArrayList(set); // LinkedList가 중간 참조/삭제 빨라서 이걸로 하는게 나음
		Collections.sort(s2); //ArrayList도 가능하다.
		Collections.sort(s1); //LinkedList로 옮겨서 정렬
		System.out.println(s1);
		System.out.println(s2);
		Collection a = new ArrayList();
		HashMap b = new HashMap();
	}

}
