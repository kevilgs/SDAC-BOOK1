package q3;

import java.util.Objects;

class Emp implements Cloneable {
	
	int id;
	String name;
	double sal;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
	
	
	
	
	
}


public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp emp = new Emp();
		Emp emp1 = (Emp) emp.clone();
		System.out.println("is emp1 equal to emp ?:"+ emp1.equals(emp));
		

	}
}
