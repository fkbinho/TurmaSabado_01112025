package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import colecao.Pessoa;

public class TesteLista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();

		while(true) {
			System.out.println("Digite o nome: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o cpf: ");
			String cpf = scan.nextLine();
			
			System.out.println("Digite a idade: ");
			int idade = scan.nextInt();
			scan.nextLine();
			
			Pessoa pessoa = new Pessoa(nome, cpf, idade);
			pessoas.add(pessoa);			
			System.out.println("Pessoa adiciona com sucesso:");
			
			System.out.println("Deseja continuar(S/N):");
			String resposta = scan.nextLine();
			
			if(resposta.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		System.out.println(pessoas);
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCpf());
			System.out.println("----------------");
		}
		
	}

}
