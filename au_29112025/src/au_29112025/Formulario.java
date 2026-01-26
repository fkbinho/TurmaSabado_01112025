package au_29112025;

public class Formulario {

	public static void main(String[] args) {
		
		// TIPOS DE DADOS PRIMITIVOS
		/* int -> inteiros
		 * long -> inteiros maiores
		 * float -> números com casas decimais (menos precisos que o double)
		 * double -> números com casas decimais
		 * char -> caracteres
		 * boolean -> verdadeiro ou falso (true / false)
		 * */
		
		// TIPO NÃO PRIMITIVO
		// String -> textos

		String nome = "Tadeu da Silva";
		int idade = 30;
		String cpf = "05845678900";
		String celular = "(11) 91234-5678";
		String email = "tadeusilva@hotmail.com";
		String endereco = "Rua das Flores, 123, São Paulo, SP";
		double peso = 75.5;
		double altura = 1.80;
	
		System.out.println("Meu nome é " + nome 
				+ ", tenho " + idade + " anos, "
				+ "meu CPF é " + cpf
				+ ", \nmeu celular é " + celular
				+ ", meu e-mal é " + email
				+ ", \nmoro no endereço " + endereco
				+ String.format(", \npeso %.2f kg", peso)
				+ String.format(" e tenho %.2f m de altura.", altura));
		
		System.out.println("-----------------------------------");
		
		System.out.printf("Meu nome é %s, tenho %d anos, meu CPF é %s,"
				+ "%nmeu celular é %s, meu email é %s,"
				+ "%nmoro no endereço %s,"
				+ "%npeso %.2f kg e tenho %.2f m de altura.",
				nome, idade, cpf, celular, email, endereco, peso, altura);
		
//		System.out.printf("Meu nome é %s, tenho %d anos, meu CPF é %s, %nmeu celular é %s, meu email é %s, %nmoro no endereço %s, %npeso %.2f kg e tenho %.2f m de altura.", nome, idade, cpf, celular, email, endereco, peso, altura);

		
		/* Meu nome é [NOME], tenho [IDADE] anos, 
		 * meu CPF é [CPF], meu celular é [CELULAR], 
		 * meu email é [EMAIL], 
		 * moro no endereço [ENDEREÇO], 
		 * peso [PESO] kg e tenho [ALTURA] m de altura.
		 * */

	}

}
