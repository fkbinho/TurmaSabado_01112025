package scanner;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Informe o cpf:");
		String cpf = scan.next();
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		System.out.println("Digite seu salário:");
		double salario = scan.nextDouble();
		scan.nextLine(); // limpar o BUFFER
		
		System.out.println("Informe a profissão:");
		String profissao = scan.nextLine();
		
		System.out.println("Informe o sexo:");
		char sexo = scan.nextLine().charAt(0);

		
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Profissão: " + profissao);
		System.out.println("Sexo: " + sexo);
		
	}

}











