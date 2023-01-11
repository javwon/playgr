package javajungsuk.ex;
import java.util.*;
public class Excercise11_16 extends MyVector implements Iterator{

int cursor =0; //앞으로 읽어올 것
int lastRet =-1; //마지막으로 읽어온 것

public Excercise11_16(int capacity) {
	super(capacity);
}
public Excercise11_16() {
	this(10);
}

public String toString() { //이터레이터 읽어온 것 toString으로 보내기
	
	String temp = "";
	Iterator it = iterator();
	
	for(int i=0; it.hasNext();i++) {
		if(i!= 0) temp+=", ";
		temp += it.hasNext();
		
	}
	return "["+temp+"]";
}

public Iterator iterator() {
	cursor =0;
	lastRet = -1;
	return this; //클래스 자체를 리턴 Iterator가 더 큰범위라 자동형변환됨 Iterator로
}

public boolean hasNext() {
	return cursor != size();
}

public Object next() {
	Object next = get(cursor);
	lastRet = cursor++;
	return next;
	
}
public void remove() {
	if(lastRet == -1) {
		throw new IllegalStateException();
	}else {
		super.remove(lastRet);
		cursor--;
		lastRet = -1;
	}
	
}
}
