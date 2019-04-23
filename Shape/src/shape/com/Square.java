package shape.com;

public class Square extends Shape {

//	double mWidth;
//	double mHeight;
//	public Square(double width, double height) {
//		this.mWidth = width;
//		this.mHeight = height;
//	}
	
	@Override
	double area(double width, double height) {
		return width * height;
	}

	
}

