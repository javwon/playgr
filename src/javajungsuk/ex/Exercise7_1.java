package javajungsuk.ex;
//포함관계연습
public class Exercise7_1 {

	public static void main(String[] args) {
		StudaDeck deck = new StudaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.suffle();
		
		for(int i=0; i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

class StudaDeck{
	final int CARD_NUM = 20;
	StudaCard5[] cards = new StudaCard5[CARD_NUM];
	
	StudaDeck(){
		for(int i=0; i<2;i++) { //다르게했으려나
		 for(int j=0; j<CARD_NUM-10;j++)
		  {	
			 if(i==0&&(j+1==1||j+1==3||j+1==8))
			 {this.cards[j+(i*10)]=new StudaCard5(j+1,true);}
		
		    else
			 {this.cards[j+(i*10)]=new StudaCard5(j+1,false);}
		    
		  }
	}
		}
		
	public void suffle() {
		for(int i=0;i<cards.length;i++)
		{
			int n=(int)(Math.random()*cards.length);
			StudaCard5 temp= this.cards[i];
			this.cards[i] = this.cards[n];
			this.cards[n]= temp;
		}
	}
	public StudaCard5 pick(int index) {
		return this.cards[index];
	}
	public StudaCard5 pick() {
		return this.cards[(int)(Math.random()*CARD_NUM)];
	}
		
		
		
}

class StudaCard5{
	int num;  //덱에 포함되는 멤버 덱 안에서 통해서 초기화됨 
	boolean isKwang;
	StudaCard5(int num, boolean isKwang)
	{
		this.num = num;
		this.isKwang=isKwang;
	}
	
	public String toString() {
		return num+(isKwang ? "K":""); //k추가
	}
}