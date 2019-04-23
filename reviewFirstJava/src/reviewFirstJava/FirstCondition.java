package reviewFirstJava;

public class firstCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -10;
		System.out.println(num > 0 ? "This number is positive. Thank you!" : "This number is negative. Thank you!");
		
		System.out.println();
		int score = 99;
		if (score > 90) {
			System.out.println("Your score is: " + score + " so congratulation to you!");
		}else if (score >= 50) {
			System.out.println("Your score is: " + score + " so you are Pass!");
		}else {
			System.out.println("Your score is: " + score + " so you are fail!");
		};
		
	}
}
