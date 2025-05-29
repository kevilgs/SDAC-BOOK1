package q6;

class Acc4 {
	
	double calSal(double sal) {
		return sal;
	}
	
	double calSal(double sal, double bonus) {
		return sal+bonus;
	}
}

class Mananger extends Acc {
	@Override
	double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calSal(sal, bonus);
	}
}


class Emp3 extends Acc {
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		
		Mananger manager = new Mananger();
		manager.calSal(12000,2000);
		
		Emp3 emp = new Emp3();
		emp.calSal(120000);

	}
}
