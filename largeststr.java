

import java.util.Scanner;

public class largeststr {

	public static String uplo(int index, String str) {

		String[] str1 = str.split(" ");
		
		String longestWord = "";
		int elementLength = str1[0].length();
		for(int i=1; i< str1.length; i++) {
		    if(str1[i].length() >= elementLength) {
		        elementLength = str1[i].length();
		        longestWord = str1[i];
		    }
		}
		return longestWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
				 String str = sc.nextLine();
				int index = str.length();
				 System.out.println(uplo(index, str));

	}

}
