package java3;

public class Rectangle {
	Double width;
	Double length;
	Rectangle(Double width,Double length){
		this.width=width;
		this.length=length;
	}
	double area() {
		return width*length;
	}
	double perimeter() {
		return 2*(width+length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(8.0,6.0);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());

	}
}
