package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("ENTER THE CONTRACT DATA");
		System.out.println();
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Date (dd/mm/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
		
		System.out.print("Total Value: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Number of Installments: ");
		int installments = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		service.processContract(obj, installments);
		
		System.out.println();
		
		System.out.println("Invoice in Installments");
		for(Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
