package application;


import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double inital = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account cc = new Account(number, holderName, inital,withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
	
		cc.withdraw(amount);
		System.out.printf("New Balance: $ %.2f%n", cc.getBalance());
		}
		catch(DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Invalid format");
		}
		

		
		
		sc.close();
	}
}
