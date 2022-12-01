package javavideo;

import java.math.BigDecimal;

public class BigNumberrun {

	public static void main(String[] args) {
		BigNumber numbers = new BigNumber(2,3);
		System.out.println(numbers.add());
		System.out.println(numbers.mutiply());
		numbers.double1();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
		
		BigDecimal number1 = new BigDecimal("34.5");
		BigDecimal number2 = new BigDecimal("34.5");
		System.out.println(number1.add(number2));
		
		//정수를 더하기
		System.out.println(number1.add(new BigDecimal(6)));
		
		calculator a = new calculator("4500.00","7.5");
		BigDecimal totalvalue=a.totalValue(5);
		System.out.println(totalvalue);
		
		Mychar mych = new Mychar('c');
		System.out.println(mych.isVowel());
		System.out.println(mych.isNumber());
		System.out.println(mych.isAlpha());
		Mychar.printLowerCaseAlpha();
		Mychar.printupperCaseAlpha();
		
	}

}
