package construtor;

						// superclasse
public class ClasseB extends ClasseA {
	
	public ClasseB(int valor, int valor2) {
		super(valor, valor2); // Chama o construtor da superclasse (ClasseA)
		System.out.println("Construtor da Classe B");
		System.out.println("Valor 1 recebido: " + this.valor);
		System.out.println("Valor 2 recebido: " + this.valor2);
	}

}
