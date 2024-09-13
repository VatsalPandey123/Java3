package java3;

public class Employee {
	String name;
	int Id;
	String position;
	double salary;
	Employee(){
		System.out.println("Welcome to Google");
	}
	void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		System.out.println("Enter Name");
		name=sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Id");
		Id=sc.nextint();
//		sc.nextLine();
		System.out.println("Enter EmailId");
		position=sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


void display() {
	System.out.println("Name> "+name);
	System.out.println("Id> "+Id);
	System.out.println("EmailId> "+EmailId);
	System.out.println("Salary> "+salary);
	System.out.println("Department> "+department);
	System.out.println("Contact_No.> "+contact_no);
}
}
public class Createclass {

	public static void main(String[] args) {
		employee e1 = new employee();
		e1.get();
		e1.display();
	}
}
