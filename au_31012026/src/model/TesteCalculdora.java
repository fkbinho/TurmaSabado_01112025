package model;

public class TesteCalculdora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		
		c1.somar(10, 5);
		c1.somar(10, 5.8);
		c1.somar(5.8, 6.5, 15);
	}
	
}
