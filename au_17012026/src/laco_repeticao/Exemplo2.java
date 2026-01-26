package laco_repeticao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double saldo = 1000.0;
		
		while(true) {
			
			String menu = """
					Bem vindo ao banco Master
					1. Depósito
					2. Saque
					3. Extrato
					0. Sair
					""";
			System.out.print(menu);
			int opcao = scan.nextInt();
			
			if(opcao == 0) {
				System.out.println("Até breve....");
				break;
			}
	
			switch(opcao) {
			case 1:
				System.out.println("Qual o valor para o depósito:");
				double deposito = scan.nextDouble();
				
				if(deposito > 0) {
					saldo = saldo + deposito;
				} else {
					System.out.println("Valor inválido. O valor tem"
							+ " de ser positivo.");
				}
				
				System.out.println("Saldo atual: " + saldo);
			break;
			case 2:
				System.out.println("Qual o valor para o saque:");
				double saque = scan.nextDouble();
				
				if(saque > saldo || saque < 0) {
					System.out.println("Valor para saque inválido. "
							+ "Ou saldo insuficiente.");
				} else {
					saldo = saldo - saque;
				} 
				
				System.out.println("Saldo atual: " + saldo);
			break;
			case 3:
				System.out.println("Extrato:");
				System.out.println("Saldo atual: " + saldo);
			break;
			default:
				System.out.println("Opção inválida.");
			}
			
			while(true) {
				System.out.println("Deseja continuar:");
				System.out.println("1. Sim");
				System.out.println("0. Sair");
				opcao = scan.nextInt();
				if(opcao == 0 || opcao == 1) {
					break;
				} else {
					System.out.println("Opção inválida;");
					System.out.println("Digite 1 ou 0");
				}
			}
			
			if(opcao == 0) {
				System.out.println("Até breve....");
				break;
			}
		
		}
		

	}

}
