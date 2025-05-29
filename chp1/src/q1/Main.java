package q1;


class Emp{
	int id;
	String name;
	String address;
	double sal;
	
	
	void displayInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(sal);
		
	}


	public Emp(int id, String name, String address, double sal) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}
}




public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(12, "Kevil", "India", 120000);
		System.out.println(emp);
		emp.displayInfo();
		

	}
}
