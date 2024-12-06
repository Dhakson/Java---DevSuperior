package model.services;

public interface OnlinePaymentServices {
	public double paymentFee(double amount);
	public double interest(double amount, int months);

}
