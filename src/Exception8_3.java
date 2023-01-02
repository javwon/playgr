import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Exception8_3 {

	
		 public static void main(String[] args) throws IOException{
		       	BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		        String input = s.readLine();
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		        bw.write(mostused(input));
		        bw.flush();
		        bw.close();
		        
		    }
		   static char mostused(String str) {
			   int[] arr = new int[26];
			   int Max_value_index=0;
			   
			   //문자 더하기
			   for(int i =0; i<str.length();i++)
			   {	char ch = str.charAt(i);
			   		if(ch>='a'&&ch<='z') arr[ch-'a']++;
			   		if(ch>='A'&&ch<='Z') arr[ch-'A']++;
				   //arr[str.toUpperCase().charAt(i)-'A']++; 얘가 범인!! 1
			   }
			   //Maxindex찾기
			   for(int i=1;i<arr.length;i++)
			   {
					 
				  if(arr[Max_value_index]<arr[i])
				  {
					  Max_value_index =i;
				  }
				  
			   }
			   //?찾기
			   for(int i=0;i<arr.length;i++) {
				   if(i!=Max_value_index) {
					  if(arr[i]==arr[Max_value_index])
						  return '?';
				   }
			   }
			  
			   return (char)(Max_value_index+'A');
			   
			   
		   }
		}