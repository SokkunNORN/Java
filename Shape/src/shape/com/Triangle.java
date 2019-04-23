package shape.com;

public class Triangle extends Shape {

	@Override
	double area(double width, double height) {
		return (width * height) / 2;
	}

}
