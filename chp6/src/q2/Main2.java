package q2;


interface RBI {
	
	double rateofInterest();
	
	double rateofCommission();
	
	
}

class SBI implements RBI {

	@Override
	public double rateofInterest() {
		// TODO Auto-generated method stub
		return 7.8f;
	}

	@Override
	public double rateofCommission() {
		// TODO Auto-generated method stub
		return 3.2f;
	}
	
}



public class Main2 {
	public static void main(String[] args) {
		SBI sbi = new  SBI();
		System.out.println("Rate of interest" + sbi.rateofInterest());
		System.out.println("Rate of commission"+ sbi.rateofCommission());

	}
}
