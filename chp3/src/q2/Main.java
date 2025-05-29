package q2;

class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}


public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(12, "Kevil");
		System.out.println(emp);

	}
}
