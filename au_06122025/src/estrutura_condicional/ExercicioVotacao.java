package estrutura_condicional;

import java.util.Scanner;

public class ExercicioVotacao {

	public static void main(String[] args) {
		/*
		 * Criar um programa que receba a 
		 * idade de uma pessoa e determinar
		 * se ela pode votar ou não.
		 * 
		 * idade >= 18 e idade < 65 (voto obrigatório)
		 * idade >= 16 e idade < 18 ou idade >= 65 (voto opcional)
		 * idade < 16 (não pode votar)
		 */

		/* Operadores Lógicos
		 * && -> E (AND)
		 * || -> OU (OR)
		 * !  -> NÃO (NOT)
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = scan.nextInt();
		
//		if (idade >= 18) {
//			System.out.println("Pode votar.");
//		} else {
//			System.out.println("Não pode votar.");
//		}
		
		if (idade >= 18 && idade < 65) {
			System.out.println("Voto obrigatório.");
			//     verdadeiro &&     falso  ||  verdadeiro
		} else if(idade >= 16 || idade >= 65) {
			System.out.println("Voto facultativo.");
		} else {
			System.out.println("Não pode votar!");
		}
		
		scan.close();
	}

}
