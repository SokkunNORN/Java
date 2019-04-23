package InheritePerson;

public class Demo {

	public static void main(String[] args) {

		Employee employee = new Employee("Sokkun.norn", 21, "Developer");
		Student student = new Student("Sokly.Khang", 17, "Student Web_2019");
		
		System.out.println("Employee");	
		System.out.println(employee);
		System.out.println("Student");
		System.out.println(student + " , Batch: " + student.getBatch());
	}                      

}
