package model;

public class Conta {
	
	private String titular;
	private String agencia;
	private String conta;
	protected double saldo;
	
	public Conta(String titular,String agencia, String conta, double saldo){
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void exibirExtrato() {
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}
	

}
