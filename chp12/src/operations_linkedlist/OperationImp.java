package operations_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OperationImp implements Operations {

	List<EmpPojo> db = new LinkedList<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("data Has been inserted sucessfully");

	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.listIterator();
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
		Iterator<EmpPojo> iterator = db.listIterator();
		boolean b = false;
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {

				System.out.println(empPojo);
				b = true;
				break;
			}

		}
		if (!b) {
			System.out.println("No Id Found");
		}

	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.listIterator();
		boolean b = false;
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {

				empPojo.setName(name);
				System.out.println("Updated Sucessfully");
				b = true;
				break;
			}

		}
		if (!b) {
			System.out.println("No Id Found");
		}

	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();

			System.out.println(empPojo);
		}
	}

}
