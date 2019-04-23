package sokkunNorn_Midterm;

public class Demo {

	public static void main(String[] args) {

		Student midterms = new Student("Selena", "Pursat");
		midterms.addCourseStudent("Jave", 90.0);
		midterms.addCourseStudent("JQuery", 60.0);
		midterms.addCourseStudent("PHP", 80.0);
		midterms.addCourseStudent("UML", 75.5);
		midterms.addCourseStudent("Testing", 90.0);
		midterms.addCourseStudent("UP", 90.0);
		midterms.addCourseStudent("Laravel", 88.0);
		
		System.out.println("Display informationn");
		System.out.println(midterms);
		
		midterms.printGrade();
		System.out.printf("Average is %.2f" , midterms.getAverageScore());
	}


}
