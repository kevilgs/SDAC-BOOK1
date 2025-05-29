package q6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
		
	
	
}

public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(12, "Kevil", 1300000);
		System.out.println(emp);
		
		Method[] method = emp.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
		
		
		
	}
}
