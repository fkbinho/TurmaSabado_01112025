package au_29112025;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// Operadores Aritméticos
		// + -> adição
		// - -> subtração
		// * -> multiplicação
		// / -> divisão
		// % -> resto da divisão (módulo)
		
		int valor1 = 10;
		int valor2 = 3;
		
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		// Para obter um resultado com casas decimais, 
		// é necessário converter um dos operandos para double
		// chamamos de CASTING
		double divisao = (double) valor1 / valor2; // 10.0
		int resto = valor1 % valor2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.printf("Divisão: %.2f", divisao);
		System.out.println("\nResto da Divisão: " + resto);

	}

}
