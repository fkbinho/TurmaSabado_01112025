package construtor;

public class ClasseA {
	int valor;
	int valor2;
	
	public ClasseA(int valor) {
		this.valor = valor;
		System.out.println("Construtor da Classe A");
		System.out.println("Valor recebido: " + this.valor);
	}
	
	public ClasseA(int valor, int valor2) {
		this.valor = valor;
		this.valor2 = valor2;
		System.out.println("Construtor da Classe A");
		System.out.println("Valor 1 recebido: " + this.valor);
		System.out.println("Valor 2 recebido: " + this.valor2);
	}
}
