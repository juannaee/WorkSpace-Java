package model.entidades;

public class Banco {
	private Double caixa;
	private ServicoTaxa taxa;
	public static final String fmtCasaDecimal = "%.2f";

	public Banco() {

	}

	public Banco(Double caixa, ServicoTaxa taxa) throws IllegalArgumentException {
		super();

		if (caixa < 0) {
			throw new IllegalArgumentException("O valor do caixa não pode ser negativo");
		}
		if (taxa == null) {
			throw new IllegalArgumentException("O serviço de taxa não pode ser nulo!");
		}

		this.caixa = caixa;
		this.taxa = taxa;

	}

	public Double getCaixa() {
		return caixa;
	}

	public ServicoTaxa getTaxa() {
		return taxa;
	}

	public void receberPagamento(Double valor) {

		this.caixa += taxa.tax(valor);
	}

	public void realizarEmprestimo(Double valor) throws IllegalArgumentException {
		if (valor > this.caixa) {
			throw new IllegalArgumentException(
					"Valor do empréstimo excedo o saldo disponivel\nDetalhes:\nSaldo disponivel: "
							+ String.format(fmtCasaDecimal, getCaixa()) + "\nTentativa de emprestimo: "
							+ String.format(fmtCasaDecimal, valor));

		} else {
			this.caixa -= valor;
		}

	}

}
