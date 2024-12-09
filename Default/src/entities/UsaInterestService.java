package entities;

public class UsaInterestService implements InterestService{
	private double interestRate;
	
	
	public UsaInterestService(double interest) {
		this.interestRate = interest;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	

}
