package estrutura_condicional;

public class IfElse {

	public static void main(String[] args) {
		
		int numero = 10;
		
		boolean ePositivo = numero > 0; //true / false
		boolean eNegativo = numero < 0;
		
		if(ePositivo) {
			System.out.println("Número positivo.");
		} else if(eNegativo) {
			System.out.println("Número negativo.");
		} else {
			System.out.println("Número é zero.");
		}

		System.out.println("----------------");
	}
	
}
