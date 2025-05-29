package q3;


class Acc{
	
	double calSal(double sal) {
		return sal;
	}
	
	double calSal(double sal , double bonus) {
		return sal+bonus;
	}
	
}

class Manager extends Acc {
	
	@Override
	double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calSal(sal, bonus);
	}
}

class Employee extends Acc {
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
}




public class Main {
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.calSal(1200, 50);
		
		
		Employee employee = new Employee();
		employee.calSal(12000);

	}
}
