
public class Part_2_If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ######## part a #########
		char texCode = 'T';
		double price = 500.50;
		double texRile = 10;
		if (texCode != 'T') {
			System.out.println("The price: " + price);
		};
		if (texCode == 'T') {
			price += texRile * price / 100;
			System.out.println("The price: " + price);
		}
		System.out.println("");
		
		// ######### part b #########
		char opCode = '1';
		double x = 45.80;
		double y = 98.0;
		double sum;
		if (opCode == '1') {
			sum = x + y;
			System.out.println("Sum of x(" + x + "), y(" + y + ") is " + sum);
		}
		System.out.println("");
		
		// ######### part c ##########
		int currentNumber = 3;
		if (currentNumber % 2 != 0) {
			currentNumber = currentNumber * 3 + 4;
			System.out.println("The currentNumber is: " + currentNumber);
		} else {
			currentNumber /= 2;			
			System.out.println("The currentNumber is: " + currentNumber);
		}
		System.out.println("");
		
		// ######### part d #########
		int Distance = 854;
		double cost = 0;
		if (Distance >= 0 && Distance <= 100) {
			cost = 5.0;
		}
		if (Distance > 100 && Distance <= 500) {
			cost = 8.00;
		}
		if (Distance > 500 && Distance < 1000) {
			cost = 10.00;
		}
		if (Distance > 1000) {
			cost = 12.00;
		}
		System.out.println("Distance: " + Distance);
		System.out.println("Cost: " + cost);
	}
	

}
