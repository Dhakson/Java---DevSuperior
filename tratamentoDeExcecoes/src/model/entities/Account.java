package model.entities;



import model.exceptions.DomainExceptions;

public class Account{
	private Integer numberAcc;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	public Account() {
	}
	public Account(Integer numberAcc, String holder, Double balance, Double withdrawLimit) {
		this.numberAcc = numberAcc;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumberAcc() {
		return numberAcc;
	}
	public void setNumberAcc(Integer numberAcc) {
		this.numberAcc = numberAcc;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validWithdraw(amount);
		balance -= amount;
	}
	
	private void validWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new DomainExceptions("A quantia excede o limite de saque");
		} 
		if(amount > getBalance()) {
			throw new DomainExceptions("Saldo insuficiente") ;
		}

	}
	
}