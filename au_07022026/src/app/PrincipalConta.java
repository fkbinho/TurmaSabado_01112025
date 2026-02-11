package app;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Endereco;
import model.Titular;

public class PrincipalConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular(new Titular());
		
		conta.getTitular().setNome("Maria");
		conta.getTitular().setCpf("123.456.789-00");
		
		System.out.println(conta.getTitular());
		
		Conta conta2 = new Conta();
		conta2.setTitular(new Titular());
		conta2.getTitular().setNome("João");
		conta2.getTitular().setCpf("987.654.321-00");
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(conta);
		contas.add(conta2);
		
		for(int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getTitular().getNome());
		}
		
		System.out.println("-------------------");
		conta.getTitular().setEndereco(new Endereco("Rua 1", "10", "Recife", "PE"));
		conta2.getTitular().setEndereco(new Endereco("Rua 2", "5", "Recife", "PE"));
		
		for(Conta c : contas) {
			String rua = c.getTitular().getEndereco().getRua();
			System.out.println(rua);
		}
	}

}
