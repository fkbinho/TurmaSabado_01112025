package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Usando o switch case, crie um programa
		// que receba um valor inteiro de 1 a 7 e
		// imprima o dia da semana correspondente.
		//ex.: 1 - Domingo
		// 	   2 - Segunda-feira
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero de 1 a 7:");
		int dia = scan.nextInt();
		
		// switch tradicional
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			System.out.println("Dia de agradecer!");
		break;
		case 2:
			System.out.println("Segunda-feira");
		break;
		case 3:
			System.out.println("Terca-feira");
		break;
		case 4:
			System.out.println("Quarta-feira");
		break;
		case 5:
			System.out.println("Quinta-feira");
		break;
		case 6:
			System.out.println("Sexta-feira");
		break;
		case 7:
			System.out.println("Sabado");
		break;
		default:
			System.out.println("Numero invalido.");
		}
		
		// switch moderno (Java 14+)
		switch(dia) {
		case 1 -> {
			System.out.println("Domingo");
			System.out.println("Dia de agradecer!");
		}
		case 2 -> System.out.println("Segunda-feira");
		case 3 -> System.out.println("Terca-feira");
		case 4 -> System.out.println("Quarta-feira");
		case 5 -> System.out.println("Quinta-feira");
		case 6 -> System.out.println("Sexta-feira");
		case 7 -> System.out.println("Sabado");
		default -> System.out.println("Numero invalido.");
		}

//		if(dia == 1) {
//			System.out.println("Domingo");
//		} else if(dia == 2) {
//			System.out.println("Segunda-feira");
//		} else if(dia == 3) {
//			System.out.println("Terca-feira");
//		} else if(dia == 4) {
//			System.out.println("Quarta-feira");
//		} else if(dia == 5) {
//			System.out.println("Quinta-feira");
//		} else if(dia == 6) {
//			System.out.println("Sexta-feira");
//		} else if(dia == 7) {
//			System.out.println("Sabado");
//		} else {
//			System.out.println("Numero invalido.");
//		}
		
		
	}

}
