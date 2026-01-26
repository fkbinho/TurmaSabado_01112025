package revisao;

public class Revisao {

	public static void main(String[] args) {

		// exibir no console e pula de linha
		System.out.println("Revisão de Java - Parte 1");

		// exibir no console sem pular de linha
		System.out.print("Revisão de Java - Parte 2");

		// exibir no console com formatação
		System.out.printf("%nRevisão de %s - Parte %d%n", "Java", 3);

		// Tipos primitivos
		int numeroInteiro = 10;
		boolean verdadeiroFalso = true;
		char caractere = 'A';
		double numeroDecimal = 10.5;
		float numeroDecimalFloat = 5.5f;
		long numeroLongo = 100000L;
		byte numeroByte = 127;
		short numeroCurto = 32000;

		// Tipo referência = não primitivo
		String texto = "O";

		// Operadores aritméticos
		int valor1 = 20;
		int valor2 = 10;

		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		int divisao = valor1 / valor2;
		int resto = valor1 % valor2;

		int media = (valor1 + valor2) / 2;

		valor2++; // incremento -> valor2 = valor2 + 1
		valor2--; // decremento -> valor2 = valor2 - 1

		System.out.println(valor2++);
		System.out.println(valor2);

		System.out.println("--------");
		System.out.println(media);

	}

}


















