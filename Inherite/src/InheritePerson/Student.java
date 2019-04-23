package InheritePerson;

public class Student extends Person {

	private String batch;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String batch) {
		super(name, age);
		this.setBatch(batch);
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
}
