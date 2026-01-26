package laco_repeticao;

import java.util.Scanner;

public class ExemploFor01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada Fuctura");
		System.out.println("Digite um número:");
		int num = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			int result = i * num;
			System.out.printf("%d x %d = %d%n", i, num, result);
		}
		
		/* 1 x 7 = 7
		 * 2 x 7 = 14
		 * 3 x 7 = 21
		 * 4 x 7 = 28
		 * ...
		 * */
	}

}
