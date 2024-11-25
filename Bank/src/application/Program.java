package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		List <Account> list = new ArrayList<>();
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number account: ");
		int numberAcc = sc.nextInt();
		
		System.out.print("Name: ");
		sc.nextLine();
		String nameAcc = sc.nextLine();
		
		System.out.print("Initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Valeu initial deposit: ");
			double initial = sc.nextDouble();
			
			acc = new Account(numberAcc, nameAcc, initial);
		}else {
			acc = new Account(numberAcc, nameAcc);
		}
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		acc.withdraw(saque);
		System.out.println("Account data: ");
		System.out.println(acc);
		sc.close();
	}
}
