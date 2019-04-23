package reviewFirstJava;

public class Array2d_findScoreStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gradeTable = {
			{98, 89, 67, 97},
			{98, 89, 67, 97},
			{98, 89, 67, 65},
			{98, 89, 67, 97}
		};
		
		System.out.println("first student week3's mark: " + gradeTable[0][2]);
		
		System.out.print("first student score: ");
		for(int i = 0; i < gradeTable[0].length; i++) {
			System.out.print(gradeTable[0][i] + " ");
		}
	}
	
}
