package collectionAndArrayList;

import java.util.ArrayList;

/**
 * Java program that removes the third element from a list.
 * @author rita
 *
 */
public class DeleteListElement {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("red");
		al.add("black");
		al.add("green");
		al.add("yellow");
		al.remove(2);
		System.out.println(al); //"green" will be missing
	}
	
}
