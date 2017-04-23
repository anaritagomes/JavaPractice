package collectionAndArrayList;

import java.util.ArrayList;

//Write a Java program to insert an element into the list at the first position
public class InsertElementsAtFirstPosition {
	
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		ArrayList<String> al = new ArrayList<>();
	
		al.add("red");
		al.add("black");
		al.add("green");
		al.add("yellow");
		
		al.add(0, "first element");
		System.out.println(al);
	}
}