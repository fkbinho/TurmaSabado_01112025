package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String menu = """
				Escolha uma das opções:
				1. sacar
				2. depositar
				3. extrato
				""";
		System.out.print(menu);
		
		System.out.println("opcao:");
		int opcao = scan.nextInt();
		
		switch(opcao) {
		case 1 -> {
			System.out.println("Opção sacar!");
			System.out.println("Valor de saque x");
		}
		case 2 -> System.out.println("Opção depositar!");
		case 3 -> System.out.println("Opção extrato!");
		default -> System.out.println("Opção inválida!");
		}

	}

}
