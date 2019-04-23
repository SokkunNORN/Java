package InheriteAnimal;

public class Dog extends Animal {
	public void bark() {
		System.out.println("WoahWoah...!");
	}
	
	public Dog(String name, String breed) {
		super(name);
		this.setBreed(breed);
	}
	
}
