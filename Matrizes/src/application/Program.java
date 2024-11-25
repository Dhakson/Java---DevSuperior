package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para gerar as Linhas: ");
		int n = sc.nextInt();
		
		System.out.println("Digite um número para gerar as colunas: ");
		int m = sc.nextInt();
		
		int [][] matriz = new int[n][m];
		
		for(int i = 0;i<n;i++) {
			for(int j = 0; j < m; j++) {
				matriz [i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0;i < matriz.length ;i ++) {
			for(int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ": ");
					if(j>0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if(j < matriz.length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i < matriz.length - 1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}
 		
		
		}		
		sc.close();
	}
}