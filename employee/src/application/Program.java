package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Workers;

public class Program {
	public static void main(String[] args) {
		List <Workers> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrado? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n;i++) {
			System.out.println("Funcionário #"+i+": ");
			
			System.out.print("Id: ");
			int WorkerId = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String workerName = sc.nextLine();
			
			System.out.print("Salário: ");
			double baseSalary = sc.nextDouble();
			list.add(new Workers(WorkerId, workerName, baseSalary));
		}
		
		System.out.println("Digite o Id do funcionário que terá aumento salarial: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		
		if(pos != null ) {
			System.out.println("Percentual de aumento: ");
			double perc = sc.nextDouble();
			list.get(pos).increaseSalary(perc);
		}else {
			System.out.println("Id não existe!");
		}
		// Uma das formas que encontrei para ecn
		/*for(Workers e : list) {
			if(e.getId() == idSalary) {
				System.out.println("Percentual: ");
				double perc = sc.nextDouble();
				e.increaseSalary(perc);
			}
		}*/
		
		System.out.println();
		System.out.println("Lista de Funcionários");
		for(Workers i : list) {
			System.out.println(i);
		}

		
		sc.close();
	}
	
	public static Integer position(List<Workers> list, int id) {
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
