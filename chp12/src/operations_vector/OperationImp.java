package operations_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OperationImp implements Operations {
	
	Vector<EmpPojo> db = new Vector<>();
	@Override
	public void insertData(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("data Has been inserted sucessfully");
		
	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator =  db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				
				iterator.remove();
				System.out.println("Deleted sucessfully");
			}
			
		}
	}

	@Override
	public void searchData(int id) {
		Enumeration<EmpPojo>enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			
			if(empPojo.getId() == id) {
				System.out.println(empPojo);
			}
		}
		
	}

	@Override
	public void updateData(int id, String name) {
		Enumeration<EmpPojo>enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			
			if(empPojo.getId() == id) {
				
				empPojo.setName(name);
				System.out.println("updated sucessfully");
			}
		}
	}

	@Override
	public void showData() {
		Enumeration<EmpPojo>enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			
			System.out.println(empPojo);
		}
	}

}
