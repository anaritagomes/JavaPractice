import java.util.Arrays;
import java.util.Scanner;
/**
 * Java program that takes three numbers from the user and prints the greatest number 
 * @author rita
 *
 */

public class GreatestNumber {
	
	public static void main(String[] args) {
		System.out.println("Insert 3 numbers:");
		
		int numbers[] = new int[3];
        int largest = numbers[0];
        int i;
        
		for(i=0; i<numbers.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			numbers[i] = sc.nextInt();
		}
		
		//check the built array
		System.out.println(Arrays.toString(numbers));
		
		//validations
		for(i=0; i< numbers.length; i++)
        {
			//always prints larger (zero index), unless there's a bigger one
	        if(numbers[i] > largest)
	        	largest = numbers[i];
        }
		System.out.println("Larger number is "+ largest);
	}
}
