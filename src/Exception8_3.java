
public class Exception8_3 {

	public static void main(String[] args) {
		Excep ex = new Excep("hi");
		Excep1 ex1 = new Excep1("me");
		
		ex1.initCause(ex);
		
	}

}

class Excep extends RuntimeException{
	Excep(String ar){super(ar);}
}

class Excep1 extends Exception{
	Excep1(String ar){super(ar);}
}