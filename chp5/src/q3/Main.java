package q3;

class RBI {
	
	double rateOfInterest() {
		return 0;
	}
	
}


class SBI extends RBI{
	
	@Override
	double rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.8;
	}
}

class Axis extends RBI{
	@Override
	double rateOfInterest() {
		// TODO Auto-generated method stub
		return 8.9;
	}
}



public class Main {
	public static void main(String[] args) {

		RBI rbi;
		rbi = new SBI();
		System.out.println(rbi.rateOfInterest());
		rbi = new Axis();
		System.out.println(rbi.rateOfInterest());
	}
}
