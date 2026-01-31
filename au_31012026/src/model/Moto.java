package model;

public class Moto extends Veiculo {
	int cilindradas;
	
	Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	@Override
	void buzinar() {
		System.out.println("Bii Bii");
	}

}
