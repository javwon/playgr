package javajungsuk.ex;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer22 b = new Buyer22();
		b.buy(new Tv3());
		b.buy(new computer32());
		b.buy(new Tv3());
		b.buy(new Audio2());
		b.buy(new computer32());
		b.buy(new computer32());
		b.buy(new computer32());
		
		
		b.summary();

	}

}

class Buyer22{
	int money = 1000;
	Product[] cart = new Product[3];
	int i =0;
	
	void buy(Product p) {
		if(p.price > this.money) {
			System.out.println(p+"돈이 부족해요 못사유");
			
		}else {
		add(p);
		}
	}

	void add(Product p) {
		this.money -= p.price;
		
		if(i<this.cart.length) {
			this.cart[i++]=p;
		}
		else {
			Product[] cart = new Product[this.cart.length*2];
			int j=0;
			for(j=0; j<this.cart.length;j++)
			{
				cart[j]=this.cart[j];
			}
			cart[i++] =p;
			this.cart=cart;
		}
		
	}
	void summary() {
		String result ="구입한 물건: ";
		int sum=0;
		for(int i=0; i<this.cart.length;i++)
			{if(this.cart[i]==null)break;
			result += (i==0)? this.cart[i]:" ,"+this.cart[i];
			sum += this.cart[i].price;
			}
		System.out.println(result);
		System.out.println("사용한 금액: "+sum);
		System.out.println("남은 금액: "+this.money);
	}
	
}
class Product{
	 int price;
	 Product(int price){
		 this.price = price;
	 }
}

class Tv3 extends Product{
	Tv3(){super(100);}
	public String toString() {
		return "TV";
	}
}
class computer32 extends Product{
	computer32(){super(200);}
	public String toString() {
		return "computer";
	}
}
class Audio2 extends Product{
	Audio2(){super(50);}
	public String toString() {return "Audio";}
}