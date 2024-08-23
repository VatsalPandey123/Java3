package java3;
import java.util.Scanner;
public class ifelse {
	//question 1>1.	Write a  Java program to find maximum between two numbers.
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the two number");
//		int a =sc.nextInt();
//		int b = sc.nextInt();
//		if(a>b) {
//			System.out.println("Maximum number between a&b"+a);
//		}
//		else if(b>a) {
//			System.out.println("Maximum number between a&b "+b);
//		}
//
//	}
	//question 2>.	Write a  Java program to find maximum between three numbers.	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the three Numbers:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		if(a>b && a>c) {
//			System.out.println("Maximum number between three of them "+a);
//		}
//		else if(b>a && b>c) {
//			System.out.println("Maximum number between three of them "+b);
//		}
//		else if(c>a && c>b) {
//			System.out.println("Maximum number between three of them "+c);
//		}
//	}
//question 3>	Write a    Java program to check whether a number is negative, positive or zero.	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number:");
//		int a = sc.nextInt();
//		if(a>0) {
//			System.out.println("Positive");
//		}
//		else if(a<0) {
//			System.out.println("Negative");
//		}
//		else if(a==0) {
//			System.out.println("Zero");
//		}
//	}
//question 4>4.	Write a  Java program to check whether a number is divisible by 5 and 11 or not.
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Number:");
//	int x = sc.nextInt();
//	if(x%5==0 && x%11==0) {
//		System.out.println("Yes");
//	}
//	else {
//		System.out.println("No");
//	}
//}
//question 5>5.	Write a   Java   program to check whether a number is even or odd.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the three Numbers:");
//		int x =sc.nextInt();
//		if(x%2==0) {
//			System.out.println("Even");	
//		}
//		else {
//			System.out.println("Odd");
//		}
//		
//	}
//question6>6.	Write a Java   program to check whether a year is leap year or not.	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the year:");
//		int year=sc.nextInt();
//		if(year%4==0 && year%100!=0 || (year%400==0)) {
//			System.out.println("Its a leap year");	
//		}
//		else {
//			System.out.println("Its not a leap year");
//		}
//		
//	}
//question7>7.Write a Java program to check whether a character is alphabet or not.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the character:");
//		char c=sc.next().charAt(0);
//		if(Character.isLetter(c)) {
//			System.out.println("Its a Alphabet");	
//		}
//		else {
//			System.out.println("Its not a Alphabet");
//		}
//		
//	}
//question8>8.Write a Java program to input any alphabet and check whether it is vowel or consonant.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the character:");
//		char c=sc.next().charAt(0);
//		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')) {
//			System.out.println("Its a Vowel");	
//		}
//		else {
//			System.out.println("Its not a Alphabet");
//		}
//		
//	}
//question9>9.	Write a Java program to input any character and check whether it is alphabet, digit or special character.	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the character:");
//		char c=sc.next().charAt(0);
//		if(Character.isLetter(c)){
//			System.out.println(c+" Its an Alphabets");	
//		}
//		else if(Character.isDigit(c)) {
//			System.out.println(c+" Its a number");
//		}
//		else  {
//			System.out.println("Its a special Character");
//		}
//		
//	}
//question10>10.	Write a Java program to check whether a character is uppercase or lowercase alphabet
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the character:");
//		char c=sc.next().charAt(0);
//		if(Character.isUpperCase(c)){
//			System.out.println(c+" Its in Uppercase");	
//		}
//		else if(Character.isLowerCase(c)) {
//			System.out.println(c+" Its in Lowercase");
//		}
//		else  {
//			System.out.println("");
//		}
//		
//	}
//question11>11.	Write a  Java program to input week number and print week day.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the character:");
//		int x=sc.nextInt();
//		switch (x) {
//            case 1:
//            System.out.println("Monday");
//            break;
//            case 2:
//            System.out.println("Tuesday");
//            break;
//            case 3:
//            System.out.println("Wednesday");
//            break;
//            case 4:
//            System.out.println("Thursday");
//            break;    
//            case 5:
//            System.out.println("Friday");
//            break;
//            case 6:
//            System.out.println("Saturday");
//            break;
//            case 7:
//            System.out.println("Sunday");
//            break;
//        
//            default:
//            System.out.println("Sorry you have Entered a wrong number \nYou have to enter a number between 1 to 7");	
//            break;
//        }
//		
//	}
//question12>1.	Write a Java program to input month number and print number of days in that month.	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		int x=sc.nextInt();
		switch (x) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        System.out.println("Number of days in month " + x + " is: 31");
        break;
        case 4: case 6: case 9: case 11:
        System.out.println("Number of days in month " + x + " is: 30");
        break;
        case 2:
        System.out.println("Number of days in month " + x + " is: 28"); // Assuming it's not a leap year
        break;
        default:
        System.out.println("Sorry you have Entered a wrong number \nYou have to enter a number between 1 to 12"); // Invalid month
        break;
    }
		
	}
}
