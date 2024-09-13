package java3;

public class Circle {
	double radius;
	Circle(){
		radius=0.0;
	}
	Circle(double r){
		radius=r;
	}
	void set(double r) {
		radius=r;
	}
	double get() {
		return radius;
	}
	double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	double circum() {
		return 2*Math.PI*radius;
	}
	void display() {
		System.out.println(get()+" ");
		System.out.println(area()+" ");
		System.out.println(circum()+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.0);
		c1.display();
		c2.display();
		c1.set(8.0);
		c2.set(6.0);
		c1.display();
		c2.display();

	}

}
