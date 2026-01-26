package laco_repeticao;

public class LacoWhile {

	public static void main(String[] args) {
		
		int contador = 1;
		while(contador <= 5) {
			System.out.println("Olá");
			contador++; // operador unário (contador = contador + 1;
		}
		
		contador = 10;
		while(contador >= 1) {
			System.out.println("Contagem: " + contador);
			contador--;
		}
		
		contador = 5;
		while(true) {
			System.out.println("Seja bem vindo.");
			contador--;
			if (contador == 0) {
				break;
			}
			
		}
		

	}

}
