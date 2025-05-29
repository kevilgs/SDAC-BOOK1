package q6;

import java.security.spec.ECField;

class Acc2 {
	
	double calSal(double sal) {
		return sal;
	}
	
	double calSal(double sal, double bonus) {
		return sal+bonus;
	}
}

class Manager extends Acc2{
	
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
	
	void giveWork() {
		System.out.println("giving work");
	}
	
}

class Emp2 extends Acc2{
	
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
	
//	@Override
//	void giveWork() {
//		// TODO Auto-generated method stub
//		super.giveWork();
//	}
//	
//}



public class Multi {
	public static void main(String[] args) {
		
		Emp2 emp2 = new Emp2();
//		emp2.giveWork();

	}
}
}
