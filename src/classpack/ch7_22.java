package classpack;

public class ch7_22 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		b.buyProduct(new TvP());
		b.buyProduct(new Computer1());
		b.buyProduct(new Audio());
		b.summary();

	}

}

class Product11{
	int price; 
	int bonusPoint;
	
	Product11(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}
class TvP extends Product11{
	TvP(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer1 extends Product11{
	Computer1(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product11{
	Audio(){
		super(50);
	}
public String toString() {return "Adio";}
}

class Buyer1{
	int money =1000;
	int bonusPoint =0;
	int i=0;
	Product11[] p = new Product11[10];
	void buyProduct(Product11 product)
	{	
		if(this.money<product.price) {System.out.println("잔액이 부족합니다.");}
		else {
			money -= product.price;
			this.bonusPoint += product.bonusPoint;
			System.out.println(product + "을/를 구입했습니다.");
			p[i++]=product; //추가하기 
		}
		
		
		}
	

	void summary() {
		int sum =0; //summary처리 
		String itemlist ="";
		for(int i=0; i<p.length;i++)
		{
			if(p[i] == null)break;
			else {
				sum += p[i].price;
				itemlist +=p[i].toString()+", ";
			}
		}
		System.out.println("구입하신 총 금액은 :" +sum+" 이고,"+"남은 잔액은"+this.money+"입니다.");
		System.out.println("구입 하신 목록은 "+itemlist+"입니다.");
	
		
	}
	
}