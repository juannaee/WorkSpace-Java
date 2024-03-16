package model.entidades;

import model.exception.ExceptionsPersonalizada;
import model.util.BancoUtil;

public class Banco {
	private Double caixa;
	private ServicoTaxa taxa;

	public Banco() {

	}

	public Banco(Double caixa, ServicoTaxa taxa) throws ExceptionsPersonalizada {
		super();

		if (caixa < 0) {
			throw ExceptionsPersonalizada.valoresNegativos("O valor do caixa não pode ser negativo");
		}
		if (taxa == null) {
			throw ExceptionsPersonalizada.valoresNulos("A taxa não pode ser nula");
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

	public Double realizarEmprestimo(Double valor) throws ExceptionsPersonalizada {
		BancoUtil.verificacaoEmprestimo(valor, this.caixa);
		this.caixa -= valor;
		return valor;

	}

}
