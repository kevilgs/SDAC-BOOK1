package q1;

public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		System.out.println(emp.calSal(120000));
		
		Manager manager = new Manager();
		System.out.println(manager.calSal(12000,2000));
	}
}
