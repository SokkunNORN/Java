package InheritePerson;

public class Person {

	public String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		this.setAge(age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age" + age;
	}
	
	
	
}
