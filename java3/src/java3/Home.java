package java3;
import java.util.*;
public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Solid Rectangle
		int a = sc.nextInt();
//    	int b = sc.nextInt();
//		//for outer 
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=b;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//          Hollow rectangle
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=b;j++) {
//				if(i==1 || j==1 || i==a || j==b) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//Half pyramid
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//Inverted Half pyramid
//		for(int i=1;i<=a-i;i++) {
//			for(int j=1;j<=a-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//number half Pyramid
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		//number inverted half Pyramid
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=a-i+1;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		//Floyd Triangle
//		int n=1;
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(n+" ");
//				n++;
//			}
//			System.out.println();
//		}
		//0-1 triangle
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				if((i+j)%2==0) {
//					System.out.print("1 ");
//				}
//				else {
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}			
		//butterfly pattern
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=1;j<=2*(a-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=a;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=1;j<=2*(a-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
