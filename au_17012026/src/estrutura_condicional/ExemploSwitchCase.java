package estrutura_condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		// Solicite ao usuário um número de 1-12(mês)
		// e diga em qual TRIMESTRE ele pertence.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número(1-12):");
		int mes = scan.nextInt();
		
		switch(mes) {
		case 1, 2, 3 -> System.out.println("1º Trimestre.");
		case 4, 5, 6 -> System.out.println("2º Trimestre.");
		case 7, 8, 9 -> System.out.println("3º Trimestre.");
		case 10, 11, 12 -> System.out.println("4º Trimestre.");
		default -> System.out.println("Mês inválido.");
		}
	
		switch(mes) {
		case 1, 2, 3:
			System.out.println("1º Trimestre.");
		break;
		case 4, 5, 6:
			System.out.println("2º Trimestre.");
		break;
		case 7, 8, 9: 
			System.out.println("3º Trimestre.");
		break;
		case 10, 11, 12:
			System.out.println("4º Trimestre.");
		break;
		default: 
			System.out.println("Mês inválido.");
		}
		
		switch(mes) {
		case 1, 2, 3:
			System.out.println("1º Trimestre.");
		break;
		case 4, 5, 6:
			System.out.println("2º Trimestre.");
		break;
		case 7, 8, 9: 
			System.out.println("3º Trimestre.");
		break;
		case 10, 11, 12:
			System.out.println("4º Trimestre.");
		break;
		default: 
			System.out.println("Mês inválido.");
		}
	}

}
