
public class ShowObject {

	public static void main(String[] args) {
		// Create student object
		Student Wep2019 = new Student("SokkunNorn", "Male", "web2019", "2019_025", "PNC");
		
		// calling the method of the class student
		System.out.print(Wep2019.name + ": ");
		Wep2019.review("Requiment you need to review the php lesson");
		
		System.out.print(Wep2019.batch + ": ");
		Wep2019.review("Let's you think!");

		
	}

}
