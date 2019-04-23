package shape.com;

public class Demo {

	public static void main(String[] args) {
		Square a = new Square();
		System.out.println(a.area(10.0, 10.0));
		
		Shape retangle = new Retangle();
		System.out.println(retangle.area(10.2, 9.0));
		
		Shape triangle = new Triangle();
		System.out.println(triangle.area(10.2, 9.0));
	}

}
