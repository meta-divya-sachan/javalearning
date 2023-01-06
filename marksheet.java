package assigmentsacademy;

import java.util.Scanner;

public class marksheet {
	/**
	 * below fun calculate the average of grades
	 * @param grad
	 * @return
	 */
	
	public static float avgOfGrad(int[] grad) {
		int  sum = 0;
		
		for(int i=0; i<grad.length; i++) {
			sum += grad[i];
		}
		float avg = sum/(grad.length);
		return avg;
	}
	/**
	 * 
	 * @param grades
	 * @return
	 */
	public static int maxGrad(int[] grad) {
		int max = grad[0];
		for(int i=1; i<grad.length; i++) {
			if(grad[i]>max)
				max = grad[i];
		}
		
		return max;
	}
	/**
	 * 
	 * @param grades
	 */
	public static int minGrad(int[] grad) {
		int min = grad[0];
		for(int i=0; i<grad.length; i++) {
			if(grad[i]<min)
				min = grad[i];
		}
		
		return min;
	}
	
	/**
	 * 
	 * @param grades
	 * @return
	 */
	public static float percentageOfPassStudent(int[] grad) {
		
		float numOfPassStudent = 0;
		for(int i=0; i<grad.length; i++) {
			if(grad[i] >= 40)
				numOfPassStudent++;
		}
		return ((numOfPassStudent*100)/grad.length);
	}
	
	/**
	 * main function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
//		n is the number of student
		System.out.println("Enter the number of student :");
		int n = scn.nextInt();
//		grades of students
		System.out.println("Enter the grades :");
		int [] grad = new int[n];
		
		for(int i=0; i<grad.length; i++) {
			grad[i] = scn.nextInt();
		}
		
		float a = avgOfGrad( grad);
		System.out.println("The average of grade obtained : " + a);
		int b = maxGrad( grad);
		System.out.println("The maximum of grade obtained :" + b);
		int c = minGrad( grad);
		System.out.println("The minimum grade obtained :" + c);
		float d = percentageOfPassStudent(grad);
		System.out.println("The percentage of pass student :" + d);
		
		
		
		
	}

}