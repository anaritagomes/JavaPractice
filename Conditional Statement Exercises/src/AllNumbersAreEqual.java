import java.util.Scanner;

/**
 * Java program that accepts three numbers and prints "All numbers are equal" 
 * if all three numbers are equal, "All numbers are different" if all three numbers are 
 * different and "Neither all are equal or different" otherwise.
 * @author rita
 *
 */
public class AllNumbersAreEqual {
	
	//	
	
	public static void main(String[] args) {

		int[] numbers = new int[3];
		System.out.println("Insert three integer numbers:");
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}

		sc.close(); //http://stackoverflow.com/questions/15613626/scanner-is-never-closed 
		
		if(numbers[0] == numbers[1] && numbers[0] == numbers[2]){
			System.out.println("All numbers are equal.");
		} else if (numbers[0] != numbers[1] && numbers[0] != numbers[2] && numbers[1] != numbers[2]){
			System.out.println("All numbers are different."); 
		} else { 
			System.out.println("Neither all are equal or different.");
		} 
	}
}


