package java3;
import java.util.*;
public class obj {
//	double Simple(double p,double t) {
//		double r=3.8;
//		double Si=(p*r*t)/100;
//		return Si;
//		
//	}
	static void m1() 
	{
		for(int i=1;i<=100;i++) {
			System.out.print(i);
			System.out.print(",");
		}
	}
	void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		obj c1 = new obj();
		c1.m2();
//		System.out.println("Enter the Principal amount:");
//		double p=sc.nextDouble();
//		System.out.println("Enter the Principal amount:");
//		double t=sc.nextDouble();
//		System.out.println(c1.Simple(p, t));

	}

}
