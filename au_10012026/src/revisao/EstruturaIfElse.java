package revisao;

import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {
		
		/* Estrutura condicional if simples
		 * if (condição) {
		 * 		// bloco a ser executado se a condição for verdadeira
		 * }
		 * 
		 * Estrutura condicional if...else if
		 * 
		 * if (condição1) {
		 * 		// bloco a ser executado se a condição1 for verdadeira
		 * } else if (condição2) {
		 * 		// bloco a ser executado se a condição2 for verdadeira
		 * } else {
		 * 		// bloco a ser executado se nenhuma das condições anteriores for verdadeira
		 * }
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor da compra: R$");
		double valorCompra = scan.nextDouble();
		
		double valorComDesconto = 0;
		if (valorCompra >= 100.0 && valorCompra < 200.0) {
			double desconto = valorCompra * 0.05; // 5% de desconto
			valorComDesconto = valorCompra - desconto ;
		} else if(valorCompra >= 200.0 && valorCompra < 300.0) {
			double desconto = valorCompra * 0.1; // 10% de desconto
			valorComDesconto = valorCompra - desconto ;
		} else if (valorCompra >= 300.0) {
			double desconto = valorCompra * 0.15; // 15%% de desconto
			valorComDesconto = valorCompra - desconto ;
		} else {
			System.out.println("Cliente não tem direito a desconto.");
			valorComDesconto = valorCompra; // sem desconto
		}
		
		System.out.printf("Valor da Compra: R$ %.2f %n", valorCompra);
		System.out.printf("Valor com Desconto: R$ %.2f", valorComDesconto);

		
		
	}
	
	
}
