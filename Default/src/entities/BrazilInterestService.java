package entities;

public class BrazilInterestService implements InterestService {
	private double interestRate;
	
	
	public BrazilInterestService(double interest) {
		this.interestRate = interest;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}


}
