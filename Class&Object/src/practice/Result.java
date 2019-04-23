package practice;

public class Result {

	public static void main(String[] args) {
		Product product = new Product("Mac book");
		System.out.println(product);
		product.addProduct("Mac book 2012", 1000);
		product.addProduct("Mac book 2012", 1000);
		product.addProduct("Mac book 2012", 1000);
		product.addProduct("Mac book 2012", 1000);
		product.addProduct("Mac book 2012", 1000);
		 product.printProductDetail();
		 System.out.println("Total price is: "+product.getTotalPrice());
	}
	

}

