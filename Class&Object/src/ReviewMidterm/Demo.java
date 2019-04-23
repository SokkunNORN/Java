package ReviewMidterm;

public class Demo {

	public static void main(String[] args) {

		Student student = new Student("Selena", "Pursat");
		student.addCourseScore("Java", 90);
		student.addCourseScore("JQuery", 60);
		student.addCourseScore("PHP", 80);
		student.addCourseScore("UML", 75.5);
		student.addCourseScore("Testing", 90);
		student.addCourseScore("UP", 90);
		student.addCourseScore("Laravel", 88);
		System.out.println("Display information");
		System.out.println(student); 
		student.printGrade();
		System.out.printf("Average is %.2f" , student.getAverageScore());
		
		
		Student student1 = new Student("Sokkun", "Kandal");
		student1.addCourseScore("Reanetive", 97);
		student1.addCourseScore("JQuery", 87);
		student1.addCourseScore("PHP advance", 80);
		student1.addCourseScore("UML & database", 85.5);
		student1.addCourseScore("Mobile app", 99);
		student1.addCourseScore("UP", 98.9);
		student1.addCourseScore("PL", 98);
		System.out.println("Display information");
		System.out.println(student1);
		student1.printGrade();
		System.out.printf("Average is %.2f" , student1.getAverageScore());
		
	}

}
