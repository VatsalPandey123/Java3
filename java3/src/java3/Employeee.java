package java3;

public class Employeee {
	String name;
	int id;
	int salary;
	
	Employeee(int salary){
		this.salary=salary;
	}
	int getsalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee c1 = new Employeee(10000000);
		int c=c1.getsalary();
		System.out.println(c);

	}

}
