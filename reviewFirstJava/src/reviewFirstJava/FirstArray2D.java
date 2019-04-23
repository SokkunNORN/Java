package reviewFirstJava;

public class FirstArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] gradeTable = {
				{99, 89, 98, 78,80, 76, 95},
				{99, 79, 88, 70,65, 96, 90},
				{100, 99, 88, 75,80, 76, 92},
				{86, 89, 98, 78,80, 76, 95},
				{99, 89, 98, 90,80, 73, 95}
		};
		
		int sumScore = 0;
		double average = 0;
		
		System.out.print("Second student score: ");
		for (int i = 0; i < gradeTable[2].length; i++) { //column
			System.out.print(gradeTable[2][i] + " ");
			sumScore += gradeTable[2][i];
		}
		
		average = sumScore / gradeTable[1].length;

		System.out.println();
		System.out.println("Average of student second score is: " + average);

		System.out.println();
		for (int i = 0; i < gradeTable.length; i++) { //row
			for (int j = 0; j < gradeTable[i].length; j++) { //column
				System.out.print(gradeTable[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int[] row:gradeTable) { //row
			for (int cell:row) { //cell
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
	}

}
