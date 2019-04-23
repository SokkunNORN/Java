package InheriteAnimal;

public class Animal {

	String name;
	private String breed;
	String color;
	int age;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("All animal car eat");
	}
	
	public void run() {
		System.out.println("All animal can run");
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
}
