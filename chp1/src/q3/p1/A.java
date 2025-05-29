package q3.p1;


public class A {
	
	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d=  50;
	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		B b = new B();
		b.display2();

	}
	
	
}

class B extends A {
	
	B b = new B();
	void display2() {
		System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
	}
}



