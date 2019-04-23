package activity3;

// default constructor

public class StudentClass {

	// ============ instance variable ===========
	private String name;
	char sex;
	int age;
	String batch;
	
	// =========== two constructor ===========
	public StudentClass(String stuName) {
		stuName = name;
	}
	
	public StudentClass(String username, char gender, int age, String classroom) {
		name = username;
		sex = gender;
		this.age = age;
		batch = classroom;
	}
	
	public void review() {
		System.out.println(this.name + " You need review the lesson before midterm.");
	}
	
	public void study() {
		System.out.println(name + " You can study with teacher in your school.");
	}
	
	// ========== set and get name ============
	public void name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
