package model;

public class ContaPoupanca extends Conta {
	double taxaRendimento = 0.02;
	
	public ContaPoupanca(String titular,String agencia, String conta, double saldo) {
		super(titular, agencia, conta, saldo);
	}
	
	public void rendimento() {
		double rend = saldo * taxaRendimento;
		saldo += rend;
	}
	
	@Override
	public void exibirExtrato() {
		System.out.println("Conta Poupança");
		super.exibirExtrato();
	}

}
