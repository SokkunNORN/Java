
public class Intern extends Person {

	private String school;
	
	public Intern(String id, String name) {
		super(id, name);
	}

	public Intern(String id, String name, String school) {
		super(id, name);
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
	
	@Override
	void display() {
		System.out.println("ID: " + getId() + ", Name: " + getName() + ", School: " + school);
	}

}
