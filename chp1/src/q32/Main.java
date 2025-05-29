package q32;

class Emp {

	int id;
	String name;

	static String companyname;

	void display() {
		System.out.println(id);
		System.out.println(name);
	}

	static void display2() {
		System.out.println(Emp.companyname);
	}

}

public class Main {
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.display();
		Emp.display2();
	}
}
