package java3;
import java.util.*;
public class loop{
	public static void main(String []args) {
		//Write a program to print all numbers from 1 to 100 using a `for` loop.
//		for(int i=1;i<=100;i++) {
//			System.out.print(i);
//			System.out.print(",");
//		}
		//Write a program to calculate the sum of the first N natural numbers using a `while` loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
//		int n=sc.nextInt();
//		int sum=0;
//		int i=1;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		//Write a program to calculate the factorial of a given number using a `for` loop.
//		int n=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		//Write a program to reverse a given number using a `while` loop.
//		int n=sc.nextInt();
//		int sum=0;
//		int rem;
//		while(n>0) {
//			rem=n%10;
//			sum=(sum*10)+rem;
//			n=n/10;
//		}
//		System.out.println(sum);
		//Write a program to check if a given number is a prime number using a `for` loop.
//		int n=sc.nextInt();
//		boolean isprime = true;
//		if(n==0 || n==1) {
//			isprime = false;
//		}else {
//			for (int i=2;i<=n/2;i++) {
//				if(n%i==0) {
//					isprime = false;
//					break;
//				}
//			}
//		}
//		if(isprime) {
//			System.out.println(n+" is a prime number");
//		}else {
//			System.out.println(n+" is not a prime number");
//		}
		// Write a program to print the multiplication table of a given number using a `for` loop.
//		int n;
//		n=sc.nextInt();
//		for(int i=1;i<=10;i++) {
//			System.out.println(n + " X " + i + " = " + (n * i));
//			}
		// Write a program to count the number of digits in a given integer using a `while` loop.
//		int n,count=0;
//		n=sc.nextInt();
//		while(n!=0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
		//Write a program to print the first N Fibonacci numbers using a `for` loop.
//		int n,num1=0,num2=1,nth;
//		n=sc.nextInt();
//		System.out.print("Fibanacci serias : "+num1+" "+num2+" ");
//		for(int i=2;i<=n;i++) {
//			nth=num1+num2;
//			System.out.print(nth);
//			System.out.print(" ");
//			num1=num2;
//			num2=nth;
//		}
		//Write a program to calculate the sum of the digits of a given number using a `while` loop.
//		int n,sum=0,rem;
//		n=sc.nextInt();//23
//		while(n!=0) {
//			rem=n%10;
//			sum=sum+rem;
//			n=n/10;
//		}
//		System.out.println(sum);
		//Write a program to check if a given number or string is a palindrome using a loop.
//		int n,p=0,rem,k;
//		n=sc.nextInt();//23
//		k=n;
//		while(n>0) {
//			rem=n%10;
//			p=(p*10)+rem;
//			n=n/10;
//		}
//		if(k==sum) {
//			System.out.println(k +" is a palindrome");
//		}else {
//			System.out.println(k +" is a not palindrome");
//		}
		//Write a program to print a pyramid or triangle pattern using nested `for` loops.
//		1
//		22
//		333
//		4444
//		55555
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		//Write a program to check if a given number is an Armstrong number using a `while` loop.
//		int n,a=0,rem,k;
//		n=sc.nextInt();
//		k=n;
//		while(n>0) {
//			rem=n%10;
//			a=a+(rem*rem*rem);
//			n=n/10;
//		}
//		if(k==a) {
//			System.out.println(k+ " is an armstrong number");
//		}else {
//			System.out.println(k+ " is not an armstrong number");
//		}
		 //Write a program to find the Greatest Common Divisor (GCD) of two numbers using a `for` loop
//		int n1,n2,gcd=1;
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		for(int i=1;i<=n1 && i<=n2;i++) {
//			if(n1%i==0 && n2%i==0) {
//				gcd=i;
//			}
//		}
//		System.out.println("GCD of "+n1+" and " +n2+" is "+gcd);
		//Write a program to print all even and odd numbers between 1 and 50 using a `for` loop.
//		int n;
//		n=sc.nextInt();
//		System.out.println("Even Numbers : ");
//		for(int i=1;i<=n;i++) {
//			if(i%2==0) {
//				System.out.print(i);
//				System.out.print(" ");
//			}
//		}
//		System.out.println("");
//		System.out.println("Odd Numbers : ");
//		for(int i=1;i<=n;i++) {
//			if(i%2!=0) {
//				System.out.print(i);
//				System.out.print(" ");
//			}
//		}
		//Write a program to calculate the sum of even and odd digits in a given number using a `while` loop.
//		int n , even=0 , odds=0;
//		n=sc.nextInt();
//		while(n!=0) {
//			int d=n%10;
//			if(d%2==0) {
//				even+=d;
//			}else {
//				odd+=d;
//			}
//			n/=10;
//		}
//		System.out.println("Sum of even no. : "+even);
//		System.out.println("Sum of odd no. : "+odd);
		//Write a program to calculate the power of a given number using a loop (without using Math.pow).
		int n,p,res=1;
		n=sc.nextInt();
		p=sc.nextInt();
		for(int i=1;i<=p;i++) {
			res*=n;
		}
		System.out.println(n+" to the power "+p+" is "+res);
	}
}