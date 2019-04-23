
public class Array_name_salery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
		
//		============1. Find who has the highest salary============
		
		int highSalary = salary[0];
		String nameHighSalary = null;
		
		for (int i = 0; i < salary.length; i++) {
			if (highSalary < salary[i]) {
				highSalary = salary[i];
				nameHighSalary = employee[i];
			}
		}
		
		System.out.println("1.Employee who has highest salary:");
		System.out.println(nameHighSalary + " has the highest salary of " + highSalary);
		System.out.println(".................................");
		System.out.println("");
		
		
//		========2. Find who has the lowest salary========
		
		System.out.println("2. Find who has the lowest salary");
		
//		======= first loop for find the minimum of salary==========
		int lowestSalary = salary[0];
		
		for (int i = 0; i < salary.length; i++) {
			if (lowestSalary > salary[i]) {
				lowestSalary = salary[i];
			}
		}
		
//		======= second loop for show all minimum salary =========
		for (int i = 0; i < salary.length; i++) {
			if (lowestSalary == salary[i]) {
				System.out.println(employee[i] + ": " + salary[i]);
			}
		}
		System.out.println(".................................");
		System.out.println("");
		
		
//		=========3.Employee who has lower salary than average: 470.0===========
		
		System.out.println("3.Employee who has lower salary than average: 470.0");
		
		double numberSalary = 470.0;
		double average =0;
		int sumSalary = 0;
		
		for (int i = 0; i < salary.length; i++) {
			sumSalary += salary[i];
		}
		
		for (int i = 0; i < salary.length; i++) {
			average = 0;
			average = salary[i] / sumSalary;
			if (salary[i] < numberSalary) {
				System.out.println(employee[i] + ": " + salary[i] + "$");
			}
		}
		System.out.println(".................................");
		System.out.println("");
		
		
//		========4.Employee who has higher salary than average: 470.0==========
		
		System.out.println("4.Employee who has higher salary than average: 470.0");
		
		for (int i = 0; i < salary.length; i++) {
			average = 0;
			average = salary[i] / sumSalary;
			if (salary[i] > numberSalary) {
				System.out.println(employee[i] + ": " + salary[i] + "$");
			}
		}
		System.out.println(".................................");
		System.out.println("");
		
		
//		==========5.Employee who has same salary:=========
	
		System.out.println("5.Employee who has same salary:");

//		============== this loop for find number temporary duplicate==============

		int[] temp = new int[salary.length];
		int y = 0;
		for (int i = 0; i < salary.length; i++) {
			for (int k1 = i + 1; k1 < salary.length; k1++) {
				if (salary[i] == salary[k1]) {
					temp[y] = salary[k1];
					y++;
				}
			}
		}
		
//		===========This loop for find specific each duplicate number===========
		
		int[] duplicate = new int[salary.length];
		int k = 0;
		for (int i = 0; i < salary.length - 1; i++) {
			if (temp[i] != temp[i + 1]) {
				duplicate[k] = temp[i];
				k++;
			}
		}
		
//		=============this loop for show duplicate salary and name of employee===========
		
		for (int i = 0; i < duplicate.length; i++) {
			for (int j = 0; j < salary.length; j++) {
				if (salary[j] == duplicate[i]) {
					System.out.println(employee[j] + " : " + duplicate[i]);
				}
			}
		}
		
		
	}

}
