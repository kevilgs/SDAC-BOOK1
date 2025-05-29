package operations_arraylist;

import java.util.List;

public interface Operations {
	
	void insertData(List<EmpPojo>list);
	
	void deleteData(int id);
	
	void searchData(int id);
	
	void updateData(int id, String name);
	
	void showData();

}
