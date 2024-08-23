package java3;
import java.util.*;
public class Practice {
	Scanner sc = new Scanner(System.in);
	//Java Program to Get Input from the User
//	int n;
//	void get() {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//	}
//	void display() {
//		System.out.println(n);
//	}
	//Java Program to Multiply Two Floating-Point Numbers
//	double n;
//	double c;
//	void get() {
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextDouble();
//		c=sc.nextDouble();
//	}
//	void display()
//	{
//		System.out.println(n*c);
//	}
	//Java Program to Swap Two Numbers
//	int n,c;
//	void get(){
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextInt();
//		c=sc.nextInt();
//	}
//	void swap() {
//		n=n+c;
//		c=n-c;
//		n=n-c;
//		System.out.println(n);
//		System.out.print(c);
//		
//	}
//	void display() {
//		swap();
//	}
	//Java program to add to Complex Number
//	int r,i;
//	void get() {
//		Scanner sc = new Scanner(System.in);
//		r=sc.nextInt();
//		i=sc.nextInt();
//	}
//	void display() {
//		System.out.println(r+"+i"+i);
//	}
	//Java Program to Check Even or Odd Integers
//	int n;
//	void get() {
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextInt();
//	}
//	void display() {
//		if(n%2==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("odd");
//		}
//	}
	//Ascii value 
//	char n;
//	int ascii;
//    void get() {
//    	n=sc.next().charAt(0);
//	}
//    void display() {
//    	ascii=n;
//    	System.out.println(ascii);
//    }
	//Neon Number
//	int n,c,sum=0,rem,t;
//	void get() {
//		n=sc.nextInt();
//	}
//	void display() {
//		t=n;
//		c=n*n;
//		while(c>0) {
//			rem=c%10;
//			sum+=rem;
//			c/=10;
//		}
//		if(t==sum) {
//			System.out.println("neon");
//		}
//		else {
//			System.out.println("not");
//		}
//	}
	double a,p,r=3.8,t,c,n,k,j;
	void get() {
		p=sc.nextDouble();
		t=sc.nextDouble();
		n=sc.nextDouble();
	}
	void display() {
		c=n*t;
		k=p*(1+(r/n));
		j=k;
		a=(double)Math.pow(j,c);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Practice c1 = new Practice();
		c1.get();
		c1.display();
		}
}

