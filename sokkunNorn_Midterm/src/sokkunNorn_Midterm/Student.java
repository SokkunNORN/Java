package sokkunNorn_Midterm;

public class Student {

	private String firstName;
	private String province;
	private int courseCounter;
	private String[] course;
	private double[] score;
	
	String getFirstName() {
		return this.firstName;
	}
	
	String getProvince() {
		return this.province;
	}

	@Override
	public String toString() {
		return getFirstName()+" from "+getProvince();
	}
	
	public Student(String firstName, String province) {
		this.firstName = firstName;
		this.province = province;
		this.course = new String[6];
		this.score = new double[6];
		this.courseCounter = 0;
	};
	
	public void addCourseStudent(String course, double score) {
		if (courseCounter > 5) {
			System.out.println("You could enrol only 6 courses!!!");
		} else {
			this.course[courseCounter] = course;
			this.score[courseCounter] = score;
			this.courseCounter++;
		}	
	}
	
	public void printGrade() {
		for (int i = 0; i < courseCounter; i++) {
			System.out.println("-" + course[i] + ":" + score[i]);
		}
	}
	
	public double getAverageScore() {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / score.length;
		return average;
	}
	
}
