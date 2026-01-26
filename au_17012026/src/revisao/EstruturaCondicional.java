package revisao;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		// inicializando a variavel
//		int idade = 20;
//		
//		System.out.println("Verificando a idade: " + idade);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade2 = scan.nextInt();
		
		verificaIdade(idade2);
		
//		System.out.println("Idade informada: " + idade2);
		
		
	}
	
	public static void verificaIdade(int idade2) {
		if(idade2 >= 18) {
			System.out.println("Maior de idade.");
			if(idade2 >= 65) {
				System.out.println("Idoso.");
			}
		} else if(idade2 >= 0) {
			System.out.println("Menor de idade.");
			if (idade2 <= 12) {
				System.out.println("Crianca.");
				if (idade2 <= 3) {
					System.out.println("Bebe.");
				}
			} else {
				System.out.println("Adolescente.");
			}
		} else {
			System.out.println("Idade invalida.");
		}
	}
	
}
