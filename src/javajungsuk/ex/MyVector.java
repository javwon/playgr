package javajungsuk.ex;

public class MyVector {

	Object[] objArr;
	int size;
	MyVector(int capacity){
		if(capacity<0)
			throw new IllegalArgumentException("유효하지 않은 값입니다"); //매개변수 유효x
		this.objArr = new Object[capacity]; //objarr을 capacity에 맞게 생성
	}
	MyVector() {this(10);}
	
	public int size() {return this.size;}
	public int capacity(){return objArr.length;}
	public boolean isEmpty() {
		//for(int i=0; i<objArr.length;i++)
		//{
			//if(objArr[i] != null) return false;
		//}
		//return true;
		return size==0 ? true:false;
	}
	public void clear() {
		for(int i=0; i<objArr.length;i++)
			objArr[i] = null;
		
		size=0;
	}
	public Object get(int index) {
		if(index <0|| index>=size)
			throw new IllegalArgumentException("유효x값입니다.");
		
		return objArr[index];
	}
	public int indexOf(Object obj) {
		for(int i=0; i<objArr.length;i++)
		{	
			if(objArr[i].getClass()==(obj.getClass())) 
			{	
				if(objArr[i].equals(obj)) return i;
			
		     }
			//if(objArr[i].equlas(obj)) return i else -1 //각 이퀄스는 각 객체에 정의됨
		}
		return -1;
	}
	public void setCapacity(int capacity) {
		if(capacity<0) throw new IllegalArgumentException("유효하지않은 값입니다.");
		Object[] newArr = new Object[capacity];
		System.arraycopy(objArr, 0, newArr, 0, Math.min(size, capacity)); //math.min point이다.
		objArr = newArr;
		
	}
	void ensureCapacity(int min_capacity) {
		if(min_capacity>objArr.length)
			setCapacity(min_capacity);
	}
	Object remove(int index) {
		
		if(index<0||index>=size) throw new IllegalArgumentException("유효x값");
		
		Object oldobject = objArr[index];
		if(index !=size-1)
		System.arraycopy(objArr, index+1, objArr, index, size-1-index); //잘 살펴보자
		
		objArr[--size] = null;
		
		return oldobject;
	}
	boolean add(Object obj) {
		ensureCapacity(size+1); //추가할 공간 확보
		objArr[size++] = obj;
		return true;
	}
	public String toString() {
		String temp = "[";
		for(int i=0; i<size;i++)
			temp += (i==0)? objArr[i]+"" : ","+objArr[i];
		return temp + "]";
	}
}

