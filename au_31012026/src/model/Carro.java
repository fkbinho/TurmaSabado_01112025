package model;

public class Carro extends Veiculo{
	int numeroDePortas;
	
	Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano); 
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	void buzinar() {
		System.out.println("Pam Pam");
	}
	
	
	

}
