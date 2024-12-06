package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentServices onlinePaymentServices;

	public ContractService(OnlinePaymentServices onlinePaymentServices) {
		this.onlinePaymentServices = onlinePaymentServices;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentServices.interest(basicQuota, i);
			double fee = onlinePaymentServices.paymentFee(interest + basicQuota);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate,quota));
		}
	}
	
	

}
