package q2;

import java.io.IOException;

class A {
	
	void meth() throws IOException {
		throw new IOException();
	}
}

class B {
	
	A a = new A();
	void meth2() throws IOException {
		a.meth();
	}
}

class C {
	B b = new B();
	void meth3() {
		try {
			b.meth2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}



public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.meth3();

	}
}
