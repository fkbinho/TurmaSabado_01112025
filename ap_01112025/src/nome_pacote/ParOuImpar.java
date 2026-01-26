package nome_pacote;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.println("Digite um número inteiro:");
			int numero = scan.nextInt();
			
			if(numero == 0) {
				System.out.println("Programa encerrado.");
				break;
			}
			
			if (numero > 0) {
				if (numero % 2 == 0) {
					System.out.printf("O número %d é PAR.%n", numero);
				} else {
					System.out.printf("O número %d é ÍMPAR.%n", numero);
				}
			} else {
				System.out.println("Número inválido. Por favor, digite um número inteiro positivo ou 0 para sair.");
			}
			
			
		}

	}

}
