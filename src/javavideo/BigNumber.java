package javavideo;
import java.math.BigDecimal;
public class BigNumber {
	private int firstnum;
	private int secondnum;
	BigNumber(){this(0,0);}
	BigNumber(int a,int b){ this.firstnum =a;this.secondnum=b;}
	
	public int add() {return this.firstnum+this.secondnum;}
	public int mutiply() {return firstnum*secondnum;}
	public void double1() {this.firstnum*=2;this.secondnum*=2;}
	public int getNumber1() {return this.firstnum;}
	public int getNumber2() {return this.secondnum;}
	
}

class calculator {
	
	private BigDecimal number1;
	private BigDecimal number2;
	
	calculator(){}
	calculator(String number1, String number2){
		this.number1=new BigDecimal(number1);
		this.number2=new BigDecimal(number2).divide(new BigDecimal(100));}
	
	public BigDecimal totalValue(int a) {
		BigDecimal total;
		total = number1.add(number1.multiply(number2).multiply(new BigDecimal(a)));
		return total;
	}
	
}

class Mychar
{
	private char ch;
	Mychar(){}
	Mychar(char ch){this.ch=ch;}
	
	public boolean isNumber() {
		if(this.ch>='0'&&this.ch<='9')return true;
		else return false;
	}
	public boolean isAlpha() {
		if((this.ch>='a'&&this.ch<='z')||(this.ch>='A'&&this.ch<='Z'))
			return true;
		else
			return false;
	}
	public boolean isVowel() {
		if(isAlpha())
		{
			if(this.ch =='a'||this.ch=='e'||this.ch=='i'||this.ch=='o'||this.ch=='u')
			return true;
			else return false;
			}
		else return false;
		}
	static void printLowerCaseAlpha() {
		for(int i=0;i<26;i++)
		{System.out.printf("%c",'a'+i);}
	}												
	static void printupperCaseAlpha() {
		for(int i=0;i<26;i++)
	{System.out.printf("%c",'A'+i);}}
	
	public boolean isConsonat() {
		if(!isVowel()&& isAlpha())return true;
		else return false;
	}
}