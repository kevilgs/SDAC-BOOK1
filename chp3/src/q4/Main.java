package q4;

class Emp {
	
	int id;
	String name;
	double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(12);
		emp.setName("kevil");
		emp.setSalary(1200000000);
		
		System.out.println(emp);

	}
}
