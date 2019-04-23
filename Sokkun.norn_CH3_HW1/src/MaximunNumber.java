
public class MaximunNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = -30;
		int num2 = 300;
		int num3 = 4;
		
		int max;
		if (num1 > num2 && num1 > num3) {
			max = num1;
		}else if (num2 > num1 && num2 > num3) {
			max = num2;
		}else {
			max = num3;
		};
		
		System.out.println("There are three integer value: " + num1 + "," + num2 + ", and " + num3);
		System.out.println( max + " is the maximun value.");
		
		System.out.println();
		System.out.println();
		
		int num4 = Math.max(num1, num2);
		if (num4 > num3) {
			max = num4;
		} else {
			max = num3;
		}
		
		System.out.println("There are three integer value: " + num1 + "," + num2 + ", and " + num3);
		System.out.println(max + " is the maximun value.");
		
	}

}
