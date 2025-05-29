package q2;

class A{
	
	A obj() {
		System.out.println("inside a ");
		return this;
	}
	
}

class B extends A {
	
	@Override
	B obj() {
		System.out.println("inside b");
		return this;
	}
}



public class Main {
	public static void main(String[] args) {

		A a = new A();
		a.obj();
		B b = new B();
		b.obj();
	}
}
