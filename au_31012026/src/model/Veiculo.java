package model;

public class Veiculo {
	// Atributos
	String marca;
	String modelo;
	int ano;
	
	// Construtor	
	Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	// Métodos
	void buzinar() {
		System.out.println("Veiculo buzinando.");
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + 
				"\nModelo: " + modelo + 
				"\nAno: " + ano;
	}
	
}
