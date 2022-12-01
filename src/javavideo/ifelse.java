package javavideo;

public class ifelse {
	private int choice;
	private int number1;
	private int number2;
	
	
	
	ifelse(){}
	ifelse(int number1, int number2,int choice){
		this.choice=choice;
		this.number1 = number1;
		this.number2 = number2;
	}
	
	
	
	static void printChoice() {
		System.out.println("choices Available are");
		for(int i=0; i<4;i++)
			{String[] str= {"1-Add","2-Subteract","3-divide","4-Muliply"};
				System.out.println(i);
			
			}
		
		
	}
}
