package model.services;

public class PaypalService implements OnlinePaymentServices{
	public static final double JUROS_MENSAL = 0.02;
	public static final double JUROS_SIMPLES =0.01;
	
	public double paymentFee(double amount) {
		return amount * JUROS_MENSAL;
	}
	
	public double interest(double amount, int months) {
		return amount * JUROS_SIMPLES * months;
	}

}
