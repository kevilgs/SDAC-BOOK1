package q6;

class Acc {
	
	double calSal(double sal) {
		return sal;
	}
	
	double calSal(double sal, double bonus) {
		return sal+bonus;
	}
}

class Emp extends Acc {
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
}



public class Single {
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.calSal(120000);
	}
}
