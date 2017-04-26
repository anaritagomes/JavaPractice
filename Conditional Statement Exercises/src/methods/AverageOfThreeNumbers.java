package methods;

import java.util.Scanner;

/**
 * Write a Java method to compute the average of three numbers. 
 * @author rita
 *
 */

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		
		int numbers[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number :");
		numbers[0]=sc.nextInt();
		System.out.println("Input second number :");
		numbers[1]=sc.nextInt();
		System.out.println("Input third number :");
		numbers[2]=sc.nextInt();
		getAverage(numbers[0], numbers[1], numbers[2]);
		sc.close();
	}
	
	public static double getAverage(int num1, int num2, int num3){
		 
		double average = (num1 + num2 + num3)/3;
		System.out.println("The average is " + average);
		
		return average;
	}
}
