package assigmentsacademy;

import java.util.Scanner;

public class  upperLower {
	public static void uplo(int index, String str) {

		for(int i=0; i<index; i++){
			char c = str.charAt(i);
		if( (int)str.charAt(i)>=97 && str.charAt(i)<=122) {
				
			     c = Character.toUpperCase(str.charAt(i));
			
	}
		else if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90) {
			
			 c = Character.toLowerCase(c);
			
		}
		else {
			 c = Character.toUpperCase(c);
		}
		 
	  System.out.print(c);
		  
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         System.out.print("Enter the string:");
		 String str = sc.nextLine();
		int index = str.length();
		 uplo(index, str);	
						
	}
}

