package java3;

public class Person {
	String name;
	int age;
	Person(String n , int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println("Name : "+name+" Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("vatsal",18);
		Person p2= new Person("Prabhav",18);
		p1.display();
		p2.display();

	}

}
