package q5;

class Emp {

	public Emp() {
		System.out.println("coonstructor Emp");
	}

	void display() {
		System.out.println("employeee");
	}

}

class Emp2 extends Emp {

	public Emp2() {

		super();// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}

}

public class Main {
	public static void main(String[] args) {
		
		Emp2 emp2 = new Emp2();
		emp2.display();

	}
}
