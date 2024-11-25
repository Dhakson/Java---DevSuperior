package entities;

public class Account {
	private int numberAccount;
	private String holder;
	private double balance;
	
	public Account() {
	}
	public Account(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}
	public Account(int numberAccount, String holder, double balance) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		this.balance = balance;
	}
	public int getNumberAccount() {
		return numberAccount;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0 ;
	}
	@Override
	public String toString() {
		return numberAccount + " , Holder: " + holder + ", Balance: $  " + String.format("%.2f", balance);
	}
	
	
	
}
