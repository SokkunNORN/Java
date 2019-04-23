package practice;

public class Product {
private String name;
private String[] model;
private double[] price;
private int numberProduct;

@Override
public String toString() {
	return "Product name is: "+name;
}
public Product(String name) {
	this.name= name;
	this.model= new String[5];
	this.price= new double[5];
	numberProduct= 0;
}
public String getName() {
	return name;
}
public void addProduct(String model,double price) {
	if(numberProduct>=5) {
		System.out.println("One product could except only five model");
	}else { 
	this.model[numberProduct]= model;
	this.price[numberProduct]= price;
	numberProduct++;
	}
}
public void printProductDetail() {
	for(int i= 0;i<numberProduct;i++) {
		System.out.println(i+1+"- Model: "+model[i]+", Price "+price[i]);
	}
}
public double getTotalPrice() {
	double sum=0;
	double discound=0;
	for(int i =0 ;i<price.length;i++) {
		sum+=price[i];
	}
	if(sum>1000) {
		discound= sum*0.1;
	}
	return sum-discound;
}

}

