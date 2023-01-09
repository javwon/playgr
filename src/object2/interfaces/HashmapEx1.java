package object2.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashmapEx1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("myid","1234");
		map.put("ccc","1222");
		map.put("asdf","1234");
		
		System.out.println(map);
		
		Map map2 = new TreeMap(map);
		
		System.out.println(map2); //키값을 기준으로 정렬
		
		
		
		
		Set set = map.keySet();
		System.out.println(set);
		System.out.println(map.values());
		
		//map.remove("asdf");
		System.out.println(map.get("asdf"));
		System.out.println(map.getOrDefault("asdf", "n/a"));
		
		
		//Iterator it = map.iterator(); //맵엔 이터레이터 당연없다.
		
		
		Set set2 = map.entrySet();
		Iterator it = set2.iterator();
		//음험험
		while(it.hasNext()) {
		Entry e =(Entry)it.next();
		System.out.println(e.getKey()); //키와 값 받아오기 
		System.out.println(e.getValue());
		//System.out.println(it.next());
		}
	}

}
