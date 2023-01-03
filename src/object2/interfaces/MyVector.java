package object2.interfaces;

public class MyVector {

	public static void main(String[] args) {
		MyVector2 v1 = new MyVector2();
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add("1");
		v1.add("2");
		v1.add("3");
		System.out.println(v1);
		System.out.println(v1.remove(1));
		System.out.println(v1);
	}

}
