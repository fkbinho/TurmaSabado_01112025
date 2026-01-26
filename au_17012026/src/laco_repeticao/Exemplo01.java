package laco_repeticao;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite um número(1-12):");
			int mes = scan.nextInt();
			
			switch(mes) {
			case 1, 2, 3 -> System.out.println("1º Trimestre.");
			case 4, 5, 6 -> System.out.println("2º Trimestre.");
			case 7, 8, 9 -> System.out.println("3º Trimestre.");
			case 10, 11, 12 -> System.out.println("4º Trimestre.");
			default -> System.out.println("Mês inválido.");
			}
			
			System.out.println("Deseja continuar:");
			System.out.println("1.sim");
			System.out.println("2.não");
			int resposta = scan.nextInt();
			
			if (resposta == 2) {
				break;
			}
			
		}
		
	

	}

}
