
public class Demo {

	public static void main(String[] args) {

		Employee emp1 = new Employee("0001", "Vandy", "CodingGate", 1000);
		Intern emp2 = new Intern("0001", "Sophorn", "PNC");
		System.out.println("Employee Information");
		emp1.display();
		System.out.println("Intern Information");
		emp2.display();
		
	}

}
