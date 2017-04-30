package inheritance;

public class Calculation {
	
	int z;

	public void addition (int x, int y){
		x = 99;
		z = x+y;
		System.out.println("The sum is " + z);
	}
	
	public void subtraction (int x, int y){
		y = 43;
		z = x-y;
		System.out.println("Difference is " + z);
	}
}
