package operations_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	
	int age;
	String name;
	double sal;
	
	public Emp(int age, String name, double sal) {
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
}



public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(18, "Kevil", 1200000);
		Emp emp2 = new Emp(45, "Kevil Jr.", 1300000);
		Emp emp3 = new Emp(56, "Kevil Jr. Jr", 12800000);
		Emp emp4 = new Emp(34, "Kevil Jr. Jr. Jr", 12400000);
		List<Emp> list = new ArrayList<Emp>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println("before");
		Iterator<Emp> iterator = list.iterator();
		while (iterator.hasNext()) {
			Emp emps = (Emp) iterator.next();
			System.out.println(emps);
		}
		
		Collections.sort(list);
		System.out.println("after");
		Iterator<Emp> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Emp emps = (Emp) iterator2.next();
			System.out.println(emps);
		}
		
		System.out.println("Using Comparator");
		Collections.sort(list, new AgeComparator());
		Iterator<Emp> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			Emp emps = (Emp) iterator3.next();
			System.out.println(emps);
		}

	}
}
