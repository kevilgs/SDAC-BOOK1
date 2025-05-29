package q1;

class Emp {
	
	static String companyname = "SDAC";
	
	static void display() {
		System.out.println(Emp.companyname);
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		Emp.display();

	}
}
