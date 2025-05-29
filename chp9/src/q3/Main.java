package q3;
// local

class Outter {
	
	final private int id=72;
	
	void meth() {
		
		class Inner {
			
			void meth2() {
				System.out.println(id);
			}
		}
		
		Inner inner = new Inner();
		inner.meth2();
		
	}
	
}




public class Main {
	public static void main(String[] args) {

		Outter outter = new Outter();
		outter.meth();
	}
}
