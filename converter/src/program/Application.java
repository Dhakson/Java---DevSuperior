package program;


import java.util.Scanner;

import entities.Convertion;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bougth: ");
		double comprar = sc.nextDouble();
		Convertion converter = new Convertion(priceDollar, comprar);
		
		System.out.println(converter);
		
		sc.close();
	}

}
