package q4;

class Emp {
	
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object is being deleted");
	}
	
	
	
}


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(12, "Kevil", 1200000);
		System.out.println(emp);
		emp = null;
		System.gc();
	}
}
