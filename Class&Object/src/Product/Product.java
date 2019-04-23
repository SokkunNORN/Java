package Product;


public class Product {

	private String name;
	private String[] model;
	private double[] price;
	private int numberProduct;
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product name is: "+this.getName();
	}

	public Product(String name) {
		this.name = name;
		this.model = new String[5];
		this.price = new double[5];
		this.numberProduct = 0;
	}
	
	public void addProduct(String model, double price) {
		if (numberProduct < 5) {
			this.model[numberProduct] = model;
			this.price[numberProduct] = price;
			numberProduct++;
		} else {
			System.out.println("One product could except only 5");
		}
	}
	
	public void printProductDetail() {
		for (int i = 0; i < numberProduct; i++) {
			System.out.println(i + 1 + " - Model:" + model[i] + ", Price: " + price[i] + "$");
		}
	}
	
	public double getTotalPrice() {
		double sum = 0;
		double discount = 0;
		for (int i = 0; i < price.length; i++)  {
			sum += price[i];
		}
		if (sum >= 1000) {
			discount = sum * 0.1;
		}
		return sum - discount;
	}
}
