package inheritance;

public class MyCalculation extends Calculation {
	
	public void multiplication (int x, int y){ 
		x = 50;
		y = 3;
		z = x*y;
		System.out.println("Product is " + z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b); 
		
	}
}
