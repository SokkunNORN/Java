package testing;

public class ClassStudent {

	String name;
	String id;
	String subject;
	int age;
	
	public ClassStudent(String name, String id, String subject, int age) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.age = age;
	};
	
	public void study(String requiment) {
		System.out.println("You are a student so you need " + requiment);
	}
	
	public void search(String requiment) {
		System.out.println("You can share lesson or search the lesson bofore the study" + requiment);
	}
	
}
