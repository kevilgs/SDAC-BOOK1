package q5;

// pass class as a reference


interface A {
	
}

abstract class B {
	
}

class  C {
	
	void meth(A a, B b) {
		
	}
	
}






public class Main {
	public static void main(String[] args) {

		C c = new C();
		c.meth(new A() {
		}, new B() {
		});
	}
}
