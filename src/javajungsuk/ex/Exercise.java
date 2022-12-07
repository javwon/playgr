package javajungsuk.ex;

public class Exercise {
	public static void main(String[] args) {
		StudaCard card1 = new StudaCard(3,false);
		StudaCard card2 = new StudaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
	}
	
	
}

class StudaCard{
	private int num;
	private boolean isKwang;
	
	StudaCard(){
		this(1,true);
	}
	StudaCard(int num, boolean isKwang){
		if(num>=1 && num<=10)
			this.num=num;
		this.isKwang=isKwang;
		
	}
	public String info() {
		String result = new String();
		result += this.num;
		if(isKwang)
			result+="K";
		
		return result;
	}
}