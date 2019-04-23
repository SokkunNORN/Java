package InheriteAnimal;

public class demo {

	public static void main(String[] args) {
		
		Dog dog = new Dog(null, null);
		dog.name = "Lukyluky";
		dog.setBreed("Thai");
		dog.color = "white and black";
		dog.age = 1;
		
		System.out.println(dog.getBreed());
		dog.eat();
		dog.run();
	}

}