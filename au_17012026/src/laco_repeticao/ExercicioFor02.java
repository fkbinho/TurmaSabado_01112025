package laco_repeticao;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		/* Crie um programa que leia gênero e 
	    peso de 8 pessoas, usando a estrutura
		“for”. No final, mostre na tela:
		
		a) Quantas mulheres foram cadastradas
		b) Quantos homens pesam mais de 100Kg
		c) A média de peso entre as mulheres
		d) O maior peso entre os homens
 		*/
		
		Scanner scan = new Scanner(System.in);
		
		char sexo;
		double peso;
		int numeroMulheres = 0;
		int homensMaior100Kg = 0;
		double mediaPeso = 0;
		double totalPeso = 0;
		double maiorPesoHomem = 0;
	
		
		for(int i = 0; i < 8; i++) {
			System.out.println("Informe seu sexo f/m:");
			sexo = scan.nextLine().charAt(0);
			
			System.out.println("Informe o peso:");
			peso = scan.nextDouble();
			scan.nextLine();
			
			if(sexo == 'f') {
				numeroMulheres++;
				totalPeso += peso; // totalPeso = totalPeso + peso;
			}
			
			if(sexo == 'm' && peso > 100) {
				homensMaior100Kg++;
			}
			
			if(sexo == 'm' && peso > maiorPesoHomem) {
				maiorPesoHomem = peso;
			}
		}

		System.out.println("Mulheres cadastradas: " + numeroMulheres);
		System.out.println("Homens +100kg: " + homensMaior100Kg);
	
		mediaPeso = totalPeso / numeroMulheres;
		
		System.out.printf("Média de peso entre as Mulheres: %.2f%n", mediaPeso);
		System.out.printf("O maior peso entre os homens: %.2f", maiorPesoHomem);
		
		
	}

}
