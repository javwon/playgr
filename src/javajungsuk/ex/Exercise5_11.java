package javajungsuk.ex;

public class Exercise5_11 {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int y=0;y<score.length;y++)
		{
			for(int x=0; x<score[y].length;x++)
			{
				result[y][x] = score[y][x];
				result[y][result[y].length-1] += result[y][x]; //바보.. 제발 ㅜㅜ 생각좀 
				
			}
			for(int k=0; k<result[0].length;k++)
			{
				result[result.length-1][k] += result[y][k];
			}
			
			
		}
		for(int i=0; i<result.length;i++)
		{
			for(int j=0; j<result[i].length;j++)
				System.out.printf("%4d",result[i][j]);
			System.out.println();
		}
			
		

	}

}
