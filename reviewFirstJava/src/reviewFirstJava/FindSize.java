package reviewFirstJava;

public class FindSize {
	public static void main(String[] args) {
		char size = 'S';
		switch (size) {
			case 'S':
				System.out.println("S: is small costs 5.0$.");
				break;
			case 'M':
				System.out.println("M: is medium 5.5$.");
				break;
			case 'L':
				System.out.println("L: is large 6$.");
				break;
			default:
				System.out.println("Not in the stock.");
		}
	}
}
