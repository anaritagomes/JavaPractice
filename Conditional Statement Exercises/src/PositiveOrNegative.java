import java.util.Scanner;

public class PositiveOrNegative {
	//Write a Java program to get a number from the user 
	//and print whether it is positive or negative
	
	public static void main(String[] args) {
		System.out.println("Insert a number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		if(input < 0){
			System.out.println("Number is negative");
		} else if (input > 0){
			System.out.println("Number is positive");
		} 
	}
	
}
