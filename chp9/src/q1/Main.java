package q1;


class A {
	
	private int id;
	
	class Inner {
		
		void meth() {
			System.out.println(id);
		}
	}
}






public class Main {
	public static void main(String[] args) {

		A a = new A();
		A.Inner inner = a.new Inner();
		inner.meth();
	}
}
