package model.entidades;

import java.util.List;

import model.exception.ExceptionsPersonalizada;

public class Mercado {
	private Banco banco;
	private List<Produto> produtos;
	private Double caixa;


	public Mercado() {

	}

	public Mercado(Banco banco) throws IllegalArgumentException {
		if (banco == null) {
			throw new IllegalArgumentException("O banco não pode ser nulo!");
		}
		this.banco = banco;

		this.caixa = 0.0;
	}

	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Double getCaixa() {
		return caixa;
	}

	public void pegarEmprestimo(Double valor) throws ExceptionsPersonalizada {
		this.caixa = banco.realizarEmprestimo(valor);
	}
	
	public void pagarEmprestimo(Double valor) {
		this.caixa -= banco.receberPagamento(valor);	
		
	}

}
