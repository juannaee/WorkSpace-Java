package model.entidades;

import model.exception.ExceptionsPersonalizada;
import model.util.ProdutoUtil;

public class Produto extends Deposito {

	public Produto(String nomeProduto, Double precoProduto, Integer qtdDisponivel) throws ExceptionsPersonalizada {
		super(nomeProduto, precoProduto, qtdDisponivel);
		if (nomeProduto == null) {
			throw ExceptionsPersonalizada.valoresNulos("O nome produto não pode estar nulo!");
		}
		if (precoProduto < 0) {
			throw ExceptionsPersonalizada.valoresNegativos("O preço produto não pode ser o valor negativo!");
		}
		if (qtdDisponivel < 0) {
			throw ExceptionsPersonalizada.valoresNegativos("A quantidade de produtos não pode ser negativa!");
		}

	}

	public String getNome() {
		return this.nomeProduto;
	}

	public Double getPrecoProduto() {
		return this.precoProduto;
	}

	public Integer getQtdDisponivel() {
		return this.qtdDisponivel;
	}

	@Override
	public Double calcularValorTotal() {

		return this.precoProduto * this.qtdDisponivel;
	}

	@Override
	public void addProduto(Integer quantidadeAdd) throws ExceptionsPersonalizada {
		ProdutoUtil.VerificarQuantidadeAdd(quantidadeAdd, getQtdDisponivel());
		this.qtdDisponivel += quantidadeAdd;

	}

	@Override
	public void removerProduto(Integer quantidadeRemover) throws ExceptionsPersonalizada {
		ProdutoUtil.verificarQuantidadeRemovida(quantidadeRemover, getQtdDisponivel());
		this.qtdDisponivel -= quantidadeRemover;

	}

}
