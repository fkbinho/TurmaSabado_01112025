package principal;

import model.Conta;
import model.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Tadeu Silva","0678", "008358-8", 100.0);
		c1.depositar(500);
		c1.exibirExtrato();
		
		System.out.println("----------------------");
		
		ContaPoupanca cp1 = new ContaPoupanca("Gabriela Silva" ,"0678", "085653-8", 300.00);
		cp1.rendimento();
		cp1.exibirExtrato();
		cp1.depositar(50.0);
		
		System.out.println("----------------------");
		cp1.exibirExtrato();
		
		cp1.setTitular("Gabriela Moraes");
		System.out.println("Titular editado: " + cp1.getTitular());
		
	

	}

}
