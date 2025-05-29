package q5;


class Emp {
	
	int id;
	
	static String companyname;
	
	void display() {
		String name="Kevil";
		System.out.println(name);
		System.out.println(id);
		System.out.println(Emp.companyname);
	}
	
	
}




public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display();

	}
}
