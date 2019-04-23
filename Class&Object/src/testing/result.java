package testing;

public class result {

	public static void main(String[] args) {
		
		ClassStudent sokkun = new ClassStudent("Sokkun", "2019_025", "Web_2019", 21);
	
		System.out.println(sokkun.name);
		sokkun.study(sokkun.name);
	}
}
