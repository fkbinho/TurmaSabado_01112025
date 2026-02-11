package app;

import java.util.ArrayList;
import java.util.List;

import model.Pagamento;
import model.PagamentoCartao;
import model.PagamentoDinheiro;

public class Principal {

	public static void main(String[] args) {
		
		List<Pagamento> pagamentos = new ArrayList<>();
		
		Pagamento pgmtoCartao = new PagamentoCartao(500.0, 2.5555);
		System.out.println(pgmtoCartao);
		System.out.println(pgmtoCartao.processar());
		
		Pagamento pgmtoDinheiro = new PagamentoDinheiro(225.0, 250.0);
		System.out.println(pgmtoDinheiro.processar());
		System.out.println(pgmtoDinheiro);

		
		pagamentos.add(pgmtoCartao);
		pagamentos.add(pgmtoDinheiro);
		
		System.out.println("--------------");
		System.out.println(pagamentos);
		
		System.out.println("--------------");
//		for(Pagamento p : pagamentos) {
//			System.out.println(p);
//		}
		
		for(int i = 0; i < pagamentos.size(); i++) {
			System.out.println("ID: " + pagamentos.get(i).getIdTransacao() + " - Valor: R$ " + String.format("%.2f", pagamentos.get(i).getValorCompra()));
		}
		
		
	}

}
