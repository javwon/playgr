package javajungsuk.ex;

public class Exercise5_6 {

	public static void main(String[] args) {
		int[] coinUnit= {500,100,50,10};
		int money = 4760;
		System.out.println("money ="+money);
		
		for(int i=0; i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"원 :"+money/coinUnit[i]);
			money%=coinUnit[i];
		}

	}
//약간 
}
