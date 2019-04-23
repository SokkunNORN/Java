package Inherite;

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Employee("001", "Vannacry", "CodingGade", 500);
		Person person2 = new Intern("001", "Sopheak", "PNC");
		System.out.println("Employee Information");
		person1.display();
		System.out.println("Intern Information");
		person2.display();

	}

}
