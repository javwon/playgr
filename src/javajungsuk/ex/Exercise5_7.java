package javajungsuk.ex;

public class Exercise5_7 {

	public static void main(String[] args) {
		if(args.length !=1)
		{
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money ="+money);
		
		int[] coinUnit = {500,100,50,10};
		int[] coin = {5,5,5,5};
		
		for(int y=0;y<coinUnit.length;y++)
		{
			
			int coinNum=0;
			coinNum=money/coinUnit[y];
			if(coinNum<=coin[y])
			coin[y] -= coinNum;
			else {
				coinNum=coin[y];
				coin[y]-=coinNum;
				System.out.println(coinUnit[y]+"원 동전에 갯수가 모자랍니다. 가지고 있는 동전만 모두 사용합니다.");
				
			}
			
			System.out.println(coinUnit[y]+"원 :"+coinNum);
			money -= (coinUnit[y]*coinNum);
			
			
		}
		if(money>0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수=");
		for(int y=0; y<coinUnit.length;y++)
			System.out.println(coinUnit[y]+"원 :"+coin[y]);
		

	}

}
