package model;

public class TesteCarro {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Toyota", "Corolla", 2020);
		
		Carro c1 = new Carro("Honda", "Civic", 2021, 4);
		System.out.println(c1.toString());
		c1.buzinar();
		
		Moto m1 = new Moto("Honda", "XRE", 2022, 300);
		m1.buzinar();
	
		
	}

}
