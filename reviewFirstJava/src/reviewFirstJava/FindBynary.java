package reviewFirstJava;

public class findBynary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 ======================================================
		  		 		   decimal to bynary
		 ======================================================
		 */
		
		int[] numberArr = new int[27];
		int i = 0;
		
		int number = 15760;
		
		System.out.println("Decimal number to bynary number: ");
		while (number > 0) {
			if (number % 2 == 0) {
				
				number /= 2;
				if(number > 0) {
					System.out.print(0 +",");
					numberArr[i] = 0;
				} else {
					System.out.println(0);
					numberArr[i] = 0;
				}
				i++;
			
			} else {
				
				number = number / 2 - 1/2;
				if(number > 0) {
					System.out.print(1 +",");
					numberArr[i] = 1;
				} else {
					System.out.println(1);
					numberArr[i] = 1;
				}
				i++;
				
			}
		}
		System.out.println("");
		System.out.println("");
		
		
		/*
		 ======================================================
		  		 		    bynary to decimal
		 ======================================================
		 */
		
		int sum = 0;
		int k = 0;
		for (int byna: numberArr) {
			sum += byna * Math.pow(2, k);
			++k;
		}
		System.out.println("Bynary number to decimal number: ");
		System.out.println(sum);
	}

}
