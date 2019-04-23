package org.pnc.wep2019.finalExam;

public class Demo {

	public static void main(String[] args) {

		Customer customer1 = new Visitor("Vanndy", 150, 20);
		Customer customer2 = new SilverMembership("Sophea", 300, 50 );
		GoldMembership customer3 = new GoldMembership("Rith", 250, 5);
		customer3.setRisteredYear(2);
		GoldMembership customer4 = new GoldMembership("Nat", 350, 50);
		customer4.setRisteredYear(0);
		GoldMembership customer5 = new GoldMembership("Ponleu", 400, 40);
		customer5.setRisteredYear(4);
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		System.out.println(customer3.toString());
		System.out.println(customer4.toString());
		System.out.println(customer5.toString());
		
	}

}
