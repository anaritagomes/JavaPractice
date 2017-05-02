package designPatterns;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		SingleObject singleton1 = SingleObject.getInstance();
		singleton1.showMessage();
		SingleObject singleton2 = SingleObject.getInstance();
		
		// Since we're dealing with singleton pattern, the hashes must be equal
		SingletonTest.getHash(singleton1);
		SingletonTest.getHash(singleton2);
		
	}
}


 class SingletonTest { // We can't have two public classes in one file 
/**
 * Gets object hash.
 * @param so
 */
	 static void getHash(SingleObject so) {
		 System.out.println(so.hashCode());
	 }
}
