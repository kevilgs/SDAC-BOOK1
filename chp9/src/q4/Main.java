package q4;

//anonymous class


interface A {
	void meth();
}

abstract class B {
	
	abstract void meth2();
	
}


class C {
	void meth3() {
		
	}
	
}


public class Main {
	public static void main(String[] args) {
		
		A a = new A() {
			
			@Override
			public void meth() {
				
				// TODO Auto-generated method stub
				System.out.println("interfaceee");
			}
		};
		
		B b = new B() {
			
			@Override
			void meth2() {
				// TODO Auto-generated method stub
			
				System.out.println("abstracttttt");
			}
		};
		C c = new  C() {
			@Override
			void meth3() {
				// TODO Auto-generated method stub
				System.out.println("normal class");
			}
		};
		
		a.meth();
		b.meth2();
		c.meth3();

	}
}
