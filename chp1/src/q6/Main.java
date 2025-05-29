package q6;

class Hobbies{
	
}

class Address {
	
	String cityname;

	public Address(String cityname) {
		super();
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + "]";
	}


}

class Emp {
	
	int id;
	String name;
	Hobbies hobbies;
	Address address;
	public Emp(int id, String name, Hobbies hobbies, String string) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
	
	
	
}


public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(12, "Kevil", null, null);
		System.out.println(emp);

	}
}

