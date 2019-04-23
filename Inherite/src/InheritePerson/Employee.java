package InheritePerson;

public class Employee extends Person {

	private String position;
	
	public Employee() {
		
	}
	
	public Employee(String position) {
		this.position = position;
	}
	
	public Employee(String name, int age) {
		super(name);
		this.setAge(age);
	}
	
	public Employee(String name, int age, String position) {
		super(name, age);
		this.position = position;
	}

	@Override
	public String toString() {
//		return "Name: " + name + " , Age: " + getAge() + " , Position: " + position;
		return super.toString() + ", Position " + position;
	}	
	
}
