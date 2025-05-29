package operations_vector;

import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		EmpPojo pojo = new EmpPojo();
		EmpPojo pojo2 = new EmpPojo();
		EmpPojo pojo3 = new EmpPojo();
		EmpPojo pojo4 = new EmpPojo();
		pojo.setId(1);
		pojo.setName("Kevil");
		pojo.setAddress("Mira Road");
//       System.out.println(pojo);

		pojo2.setId(2);
		pojo2.setName("Steve");
		pojo2.setAddress("Kalyan");
//       System.out.println(pojo2);

		pojo3.setId(3);
		pojo3.setName("Rob");
		pojo3.setAddress("Dadar");
//       System.out.println(pojo3);

		pojo4.setId(4);
		pojo4.setName("Neha");
		pojo4.setAddress("Borivali");
//       System.out.println(pojo4);

		List<EmpPojo> list = new Vector<EmpPojo>();
		list.add(pojo);
		list.add(pojo2);
		list.add(pojo3);
		list.add(pojo4);
//		System.out.println(list);

		OperationImp imp = new OperationImp();
		imp.insertData(list);
		imp.showData();
		System.out.println("-------------------");
		imp.searchData(5);
		imp.updateData(1, "KEVIL");
		imp.deleteData(3);
		imp.showData();
	}
}
