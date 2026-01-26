package revisao;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		/* Regras:
		 * Pedra ganha de Tesoura
		 * Tesoura ganha de Papel
		 * Papel ganha de Pedra
		 * */
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// ESCOLHA DO USUÁRIO
		String menu = """
				*** Jokenpo ***
				Escolha sua jogada:
				1 - Pedra
				2 - Papel
				3 - Tesoura
				""";
		System.out.print(menu);
//		System.out.println("*** Jokenpo ***");
//		System.out.println("Escolha sua jogada:");
//		System.out.println("1 - Pedra");
//		System.out.println("2 - Papel");
//		System.out.println("3 - Tesoura");
		String jogadaUsuario = scan.nextLine();
	
		// ESCOLHA DO COMPUTADOR
		int escolhaComputador = random.nextInt(1, 4);
		
		String jogadaComputador;
		if (escolhaComputador == 1) {
			jogadaComputador = "Pedra";
		} else if (escolhaComputador == 2) {
			jogadaComputador = "Papel";
		} else {
			jogadaComputador = "Tesoura";
		}
	
		// CONDIÇÃO DE VITÓRIA DO USUÁRIO
		if(jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura")
		  || jogadaUsuario.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Pedra")
		  || jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Papel")) {
			System.out.println("Você venceu!");
			System.out.println("Escolha do Usuário: " + jogadaUsuario);
			System.out.println("Escolha do Computador: " + jogadaComputador);
			
			// CONDIÇÃO DE EMPATE
		} else if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
			System.out.println("Empate!");
			System.out.println("Escolha do Usuário: " + jogadaUsuario);
			System.out.println("Escolha do Computador: " + jogadaComputador);
		
			// CONDIÇÃO DE VITÓRIA DO COMPUTADOR
		} else {
			System.out.println("Você perdeu!");
			System.out.println("Escolha do Usuário: " + jogadaUsuario);
			System.out.println("Escolha do Computador: " + jogadaComputador);
		}
	
	}

}
