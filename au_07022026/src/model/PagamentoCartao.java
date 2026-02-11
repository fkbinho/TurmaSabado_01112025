package model;

public class PagamentoCartao extends Pagamento implements Notificacao {
	private double taxaPercentual;
	
	public PagamentoCartao(double valorCompra, double taxaPercentual) {
		super(valorCompra);
		this.taxaPercentual = taxaPercentual;
	}

	public double getTaxaPercentual() {
		return taxaPercentual;
	}

	public void setTaxaPercentual(double taxaPercentual) {
		this.taxaPercentual = taxaPercentual;
	}
	
	@Override
	public boolean processar() {
		return true;
	}
	
	public double totalComTaxa() {
		return getValorCompra() * (1 + taxaPercentual / 100);
	}
	
	@Override
	public String gerarComprovante() {
		return comprovanteBase() +
				"Tipo de Pagamento: Cartão\n" +
				"Taxa Percentual: " + String.format("%.2f", taxaPercentual) + "%\n" + 
				"Valor Total com Taxa: R$ " + String.format("%.2f", totalComTaxa()) + "\n";
	}

	@Override
	public String enviarNotificacao() {
		return "Notificação: Pagamento com cartão processado com sucesso! ID Transação: " + getIdTransacao();
	}

	@Override
	public String receberNotificacao() {
		return "Notificação recebida: Pagamento com cartão confirmado! ID Transação: " + getIdTransacao();
	}
}
