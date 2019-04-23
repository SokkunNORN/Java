package reviewFirstJava;

public class reviewJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		char[] aphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		char letter = '0';
		int i = 0;
		for (int j = 0; j < aphabet.length; j++) {
			for (int k = 0; k < vowel.length; k++) {
				if (aphabet[j] == vowel[k]) {
					letter = aphabet[j];
					++i;
					System.out.println( i + ". Letter of vowel are: " + letter);
				}
			}
		}
		System.out.println("All number of vowel are: " + i + " vowels.");
	} 
}