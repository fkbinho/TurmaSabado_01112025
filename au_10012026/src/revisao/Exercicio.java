package revisao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionário:");
		String nome = scan.next();
		scan.nextLine(); // limpa o buffer
		
		System.out.println("Informe o valor do 1º dia:");
		double dia1 = scan.nextDouble();
		
		System.out.println("Informe o valor do 2º dia:");
		double dia2 = scan.nextDouble();
		
		System.out.println("Informe o valor do 3º dia:");
		double dia3 = scan.nextDouble();
		
		System.out.println("Informe o valor do 4º dia:");
		double dia4 = scan.nextDouble();
		
		System.out.println("Informe o valor do 5º dia:");
		double dia5 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Sexo:");
		String sexo = scan.nextLine();

		double mediaSemanal = (dia1 + dia2 + dia3 + dia4 + dia5) / 5;
		
		System.out.printf("Nome do funcionario: %s %nGanho semanal: %.2f %nSexo: %s", nome, mediaSemanal, sexo);

	}

}
