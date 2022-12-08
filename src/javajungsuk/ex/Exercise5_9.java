package javajungsuk.ex;

public class Exercise5_9 {

	public static void main(String[] args) {
		char[][] star= {{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*','*','*','*'},
						{'*','*','*','*','*'}};
		
		char[][] result = new char[star[0].length][star.length]; //4*5에서 -> 5*4로 누워있는거 세우는것 원래보다 칸이 많음
		
		for(int y=0; y<star.length;y++)
			{for(int x=0; x<star[y].length;x++)
				System.out.print(star[y][x]);
			
				System.out.println();
			}
		
		for(int y=0; y<star.length;y++)
			for(int x=0;x<star[y].length;x++)
			{
				result[x][y]=star[star.length-1-y][x]; //01 <-10 // 02 <-20 //문제발생 (이러면 시계반대방향 다시 시계방향으로 고쳐줘야함)
										//00<30 10 <31 , 20<32 (좌표바꾸고 거꾸로 읽게하기)
				
			}
		
		for(int y=0; y<result.length;y++)
		{for(int x=0; x<result[y].length;x++)
			System.out.print(result[y][x]);
		
			System.out.println();
		}
		
	}

}
