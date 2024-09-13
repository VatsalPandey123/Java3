package java3;
import java.util.*;
public class Dog {
	String name;
	String breed;
	Dog(){
		Scanner sc = new Scanner(System.in);
		this.name=sc.nextLine();
		this.breed=sc.nextLine();
	}
	String get_name() {
		return name;
		
	}
	void set_name(String name) {
		this.name=name;
	}
	String get_breed() {
		return breed;
		
	}
	void set_breed(String breed) {
		this.breed=breed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		Dog d2=new Dog();
		System.out.println(d1.get_name()+" is "+d1.get_breed());
		System.out.println(d2.get_name()+" is "+d2.get_breed());
		d1.set_name("Rocky");
		d1.set_breed("labrador");
		d2.set_name("charlie");
		d2.set_breed("Poodle");
		System.out.println(d1.get_name()+" is "+d1.get_breed());
		System.out.println(d2.get_name()+" is "+d2.get_breed());

	}

}
