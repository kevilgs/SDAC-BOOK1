package q2;


abstract class GovermentPolicy {
	
	
	void followGuidelines() {}
	
	void followSafety() {
		System.out.println("Follow these rules");
	}
	
	
}

class CompanyA extends GovermentPolicy{
	
	@Override
	void followGuidelines() {
		// TODO Auto-generated method stub
		System.out.println("Following government guidelines");
	}
	
	@Override
	void followSafety() {
		// TODO Auto-generated method stub
		System.out.println("Following safety rules");
	}
}

	





public class Main {
	public static void main(String[] args) {
		
		CompanyA a = new CompanyA();
		a.followGuidelines();
		a.followSafety();

	}
}
