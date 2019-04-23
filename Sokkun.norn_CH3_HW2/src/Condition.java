import java.util.Scanner;

public class Condition {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter A or a to display 10 entities per page");
		System.out.println("Enter B or b to display 20 entities per page");
		System.out.println("Enter C or c to display 50 entities per page");
		System.out.println("Enter D or d to display 100 entities per page");
		System.out.println("Enter E or e to display 200 entities per page");
		System.out.println("---------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter: ");
    	char letter = input.next().charAt(0);
    	System.out.println("You entered " + letter);
    	int entities = 150;
    	int page;
    	
    	switch(letter) {
    		case 'A':
    		case 'a' :
    			page = 10;
    			break;    		
    		case 'B' :
    		case 'b' :
    			page = 20;
    			break;
    		case 'C' :
    		case 'c' :
    			page = 50;
    			break;
    		case 'D' :
    		case 'd' :
    			page = 100;
    			break;
    		case 'E' :
    		case 'e' :
    			page = 200;
    			break;
    		default:
    			page = 5;
    	};
    	
		System.out.println("Entities: " + entities );
		System.out.println("Entities: to display per page: " + page);
		System.out.println("==============================================" );
		
		int numberPage = 0;
		System.out.print("| ");
		do {
			numberPage++;
			if (entities > page) {
				System.out.print("page" + numberPage + ":" + page + " | ");
			} else {
				System.out.print("page" + numberPage + ":" + entities + " | ");
			}	
			entities -= page;
		} while(entities > 0);
//		System.out.println(); = sout.
	}

}