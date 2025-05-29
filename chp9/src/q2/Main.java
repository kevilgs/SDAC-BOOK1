package q2;

//static 

class Outer {

	private static int id;

	static class Inner {

		static void meth() {
			System.out.println(Outer.id);
		}

	}

}

public class Main {
	public static void main(String[] args) {
		
		Outer.Inner inner = new Outer.Inner();
	Outer.Inner .meth();
	

	}
}
