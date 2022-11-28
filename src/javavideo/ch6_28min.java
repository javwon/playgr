package javavideo;

public class ch6_28min {

	void Multiplication(int table) { //메써드 오버로딩으로 리팩토링
		Multiplication(table,1,10);
	}
	void Multiplication(int table,int from,int to) {
		for(int i= from; i<=to; i++)
		System.out.printf("%d * %d = %d",table,i,table*i).println(); //체인메써드 가능!
		
	}
	void Multiplication() {
		//Multiplication(5,1,10);
		Multiplication(5);
	}
}
