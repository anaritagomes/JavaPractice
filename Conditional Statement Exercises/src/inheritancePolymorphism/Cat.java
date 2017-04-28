package inheritancePolymorphism;

public class Cat extends Animals {
	
	public Cat(String name, String favFood) {
		super(name, favFood);
		
	}

	public String favToy = "Yarn";
	
	public void playWith(){
		System.out.println("Yeah! " + favToy);
	}
	
	public void walkAroud(){
		System.out.println(this.getName() + "stalks around");
	}
	
	public String getToy(){
		
		return this.favToy;
	}
	
	public Cat(){
		
	}
	
	public Cat(String name, String favFood, String favToy){
		super(name, favFood);
		this.favToy = favToy;
		}
}
