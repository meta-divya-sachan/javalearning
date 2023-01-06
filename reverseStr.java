package assigmentsacademy;

import java.util.Scanner;

public class reverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string you want to reverse:");
			String str= sc.next();
			String arr[]=str.split(" ");
			
			for(int i=arr.length-1;i>=0;i--)
			{
			char temp[]=arr[i].toCharArray();
			System.out.print("reversed string :");
			for(int j=temp.length-1;j>=0;j--)
			{
			System.out.print( temp[j]);

			}
			System.out.print(" ");
			}
			
		}
	}}