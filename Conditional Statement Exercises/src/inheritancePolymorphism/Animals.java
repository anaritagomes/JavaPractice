package inheritancePolymorphism;

public class Animals {
	
	private String name = "Animal"; //only visible in this class
	public String favFood = "Food"; //visible to the world
	
	protected final void changeName(String newName){
		this.name = newName;
	}
	
	protected final String getName(){
		return this.name;
	}
	
	public void eatStuff(){
		System.out.println("Yum! "+ favFood);
	}
	
	public void walkAround(){
		System.out.println(this.name + " walks around");
	}
	public Animals(){}
	
	public Animals(String name, String favFood) {
		super();
		this.changeName(name);
		this.favFood = favFood;
	}
	
	
}
