package q2;

class Emp{
	
	int id;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object is being deleted");
	}
}



public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp = null;
		System.gc();

	}
}
