package laco_repeticao;

public class LacoFor {

	public static void main(String[] args) {
		
		int contador = 1;
		while(contador <= 5) {
			System.out.println("Olá");
			contador++; // operador unário (contador = contador + 1;
		}
		System.out.println("-------------------------------");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Olá");
		}
		
		System.out.println("-------------------------------");
		
		for(int i = 10; i >= 0; i--) {
			System.out.println("Contagem: " + i);
		}

	}

}
