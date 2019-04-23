package Product;

public class result {

	public static void main(String[] args) {
		
		Product mac = new Product("Mac Book");
		
		System.out.println(mac);
		mac.addProduct("Mac Book 2000", 2000);
		mac.addProduct("Mac Book 2000", 2000);
		mac.addProduct("Mac Book 2000", 2000);
		mac.printProductDetail();
		System.out.println("Total price is: " + mac.getTotalPrice() + "$");
	}

}
