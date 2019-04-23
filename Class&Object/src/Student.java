
public class Student {

	// ========== Instance variable ========
	String name;
	String sex;
	String batch;
	String id;
	String schoolName;
	
	// ========== Constructor =========
	public Student(String name, String sex, String batch, String id, String schoolName) {
		this.name = name;
		this.sex = sex;
		this.batch = batch;
		this.id = id;
		this.schoolName = schoolName;
	}
	
	// ========= Method =========
	public void review(String requiment) {
		System.out.println(requiment);
	}

}
