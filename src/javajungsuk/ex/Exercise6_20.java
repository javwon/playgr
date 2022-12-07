package javajungsuk.ex;

public class Exercise6_20 {

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result=shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		

	}

	private static int[] shuffle(int[] original) {
		int[] temp = original;
		for(int i=0;i<temp.length;i++)
		{
			int n=(int)(Math.random()*temp.length);
			int tem = temp[i];
			temp[i] = temp[n];
			temp[n] = tem;
		}
		
		return temp;
	}

}
