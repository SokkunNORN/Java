package reviewFirstJava;

public class Array_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {5, 20, 45, 11, 32};
		int sumArray = 0;
		double average = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(" | " + numArray[i]);
			sumArray += numArray[i];
		}
		System.out.print(" |");
		System.out.println("");
		
		average = sumArray / numArray.length;
		System.out.println("Average: " + average);
		
//		testing
		
		System.out.println("");
		System.out.println("");
		
		int[] number = new int[10];
		int[] addNumber = new int[10];
		int sumAllNumber = 0;
		int sumnumber = 0;
		double avg;
		
		for(int j = 0; j < number.length; j++) {
			
			number[j] = j;
			sumAllNumber = 0;
			
			for(int k = 0; k < number.length; k++) {
				sumAllNumber += number[j] * number[k];
			}
			
			addNumber[j] = sumAllNumber;
			sumnumber += addNumber[j];
			System.out.print(" | " + addNumber[j]);
			
		}
		
		avg = sumnumber / addNumber.length;
		System.out.println("");
		System.out.println("");
		System.out.println("Average is : " + avg);
		
	}

}
