package javajungsuk.ex;

public class Exercise5_8 {

	public static void main(String[] args) {
		int[] answer= {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int y=0;y<answer.length;y++)
		{
			counter[answer[y]-1]++;
		}
		for(int y=0; y<counter.length;y++)
			
		{	System.out.printf("%d이(가)  %d개",y+1,counter[y]);
			for(int x=0;x<counter[y];x++)
				System.out.printf("*");
			
			System.out.println();
		}

	}

}
