package revisao;

public class SintaxeJava {

	public static void main(String[] args) {

		System.out.print("Olá, Mundo! ");
		System.out.println("Bem vindo a Fuctura Tecnologia");
		
		// Tipos primitivos
		
		// tipo nomeVariavel = valor;
		int idade = 6; // inteiro
		long populacao = 7000000000L; // inteiro longo
		float peso = 70.5f; // numeros com casas decimais (float)
		double altura = 1.75; // numeros com casas decimais
		boolean estudante = true; // booleano
		char letra = 'A'; // caractere
		
		// Tipos não primitivos
		String nome = "João"; // cadeia de caracteres
		
		// Operadores aritméticos
		/*
		   Subtração: -
		   Adição: +
		   Multiplicação: *
		   Divisão: /
		   Módulo: %  (mod)
		   
		 */
		
		
		int num1 = 10;
		int num2 = 3;
		
		int resto = num1 % num2; // resto da divisão de num1 por num
		
		System.out.println("Resto: " + resto); // + -> concatenação
		
		
	}

}
