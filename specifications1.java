package assigmentsacademy;

import java.util.Scanner;

public class specifications1 {
	public static int stringCompare(String str1, String str2){
		int l1 = str1.length();
		int l2 = str2.length();
		
		if(str1.equals(str2) && l1==l2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		/**
		 * object of class specifications
		 */
		specifications1 obj = new specifications1();
		int result = obj.stringCompare(str1,str2);
		
        System.out.println(result);
	}

}
