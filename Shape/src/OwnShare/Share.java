package OwnShare;

public class Share {

	public static void main(String[] args) {

		int number = 10;
		for (int row = 0; row < number; row++) { // for column
			for (int col = 0; col < number; col++) { // for row
				if (row > col) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
		for (int row = 0; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for column
				if (row < col) {
					System.out.print("# ");
				} 
			}
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println();
		
		for (int row = 0; row < number; row++) { // for row
			for (int col = 0; col < number - 1; col++) { // for column
				if (row <= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for (int row = 0; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for column
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		for (int row = 0; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for column
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int row = 0; row < number; row++) { // for row
			for (int col = 0; col < number - 1; col++) { // for column
				if (row < col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("==================================");
		System.out.println();
		for (int row = number - 3; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for column
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int row = 0; row < number; row++) { // for row
			for (int col = 0; col < number - 1; col++) { // for column
				if (row < col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

		System.out.println("==================================");
		System.out.println();
		for (int row = number - 4; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for column
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int row = 0; row < number - 7; row++) { // for row
			for (int col = 0; col < number - 1; col++) { // for column
				if (row < col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("==================================");
		for (int row = 0; row < number; row++) { // for row
			for (int col = 0; col < number - 1; col++) { // for column
				if (row < col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int row = 0; row < number; row++) { // for row
			for (int col = number - 1; col > 0; col--) { // for cell
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
