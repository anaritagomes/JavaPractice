package inheritancePolymorphism;

public class JavaLessonFourteen {

	public static void main(String[] args) {
		Animals genericAnimal = new Animals();
		System.out.println(genericAnimal.getName()); //Animal
		System.out.println(genericAnimal.favFood); //Food
		genericAnimal.walkAround(); //Animal walks around
		
		
		Cat morris = new Cat("Morris", "Tuna", "Rubber mouse");
		
		System.out.println();
		System.out.println(morris.getName()); //Morris
		System.out.println(morris.favFood); //Tuna
		System.out.println(morris.favToy); //Rubber mouse
		
		morris.walkAround(); //Morris stalks around
	}
}
