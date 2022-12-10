package classpack;

public class ch7_22 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		b.buyProduct(new TvP());
		b.buyProduct(new Computer1());
		b.buyProduct(new Audio());
		b.summery();

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
	int sum=0;
	Product11[] p = new Product11[3];
	void buyProduct(Product11 product)
	{	
		if(this.money<product.price) {System.out.println("잔액이 부족합니다.");}
		else {
			money -= product.price;
			this.bonusPoint += product.bonusPoint;
			System.out.println(product + "을/를 구입했습니다.");
			sum += product.price;
			addProduct(product);
		}
		
		
		}
	
	private void addProduct(Product11 product) {
		int n=0;
		for(int i=0; i<p.length;i++,n++)
			if(p[i] == null) break;
		
		Product11[] temp = {product};
		System.arraycopy(temp, 0, p, n, 1);
		
	}

	void summery() {
		
		System.out.println("구입하신 총 금액은 :" +this.sum+" 이고,"+"남은 잔액은"+this.money+"입니다.");
		System.out.println("구입 하신 목록은 ");
		for(int i=0; i<p.length;i++)
			System.out.print(p[i]+",");
		System.out.print("입니다.");
		System.out.println("잉잉");
	}
	
}