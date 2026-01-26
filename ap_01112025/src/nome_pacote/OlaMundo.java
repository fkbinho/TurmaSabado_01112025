package nome_pacote;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá, Mundo!");
		
		System.out.println("Bem-vindo a Fuctura!");
		
		String nome = "TADEU M.";
		int idade = 28;
		
		String sobreNome = "SILVA";
		
		System.out.print(nome);
		System.out.println(" tem " + idade + " anos.");
		
		System.out.printf("%s tem %d anos.%n", nome, idade);
		
		System.out.println("------------------------");
		
		System.out.println(nome + " " + sobreNome);
		System.out.printf("%s %s tem %d anos", sobreNome, nome, idade);

		System.out.println("\nDigite seu nome:"); //Francikleber Ronsi de Queiroz
		String nomeDigitado = scan.next(); //"Francikleber"
		scan.nextLine(); // Ronsi de Queiroz // Limpar o buffer
		
		
		System.out.println("Digite seu sobrenome:");
		String sobrenomeDigitado = scan.next();
		
		System.out.println(nomeDigitado);		
		System.out.println(sobrenomeDigitado);
	}

}



















