package model.entidades;

public class Produto extends Deposito {

	public Produto(String nomeProduto, Double precoProduto, Integer qtdDisponivel) throws IllegalArgumentException {
		super(nomeProduto, precoProduto, qtdDisponivel);
		if (nomeProduto == null) {
			throw new IllegalArgumentException("O nome produto não pode estar nulo!");
		}
		if (precoProduto < 0) {
			throw new IllegalArgumentException("O preço produto não pode ser o valor negativo!");
		}
		if (qtdDisponivel < 0) {
			throw new IllegalArgumentException("A quantidade de produtos não pode ser negativa!");
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
	public void addProduto(Integer quantidadeAdd) throws IllegalArgumentException {
		if (quantidadeAdd < 0) {
			throw new IllegalArgumentException("A quantidade adicionada não pode ser negativa!!");
		}

		this.qtdDisponivel += quantidadeAdd;

	}

	@Override
	public void removerProduto(Integer quantidadeRemover) throws IllegalArgumentException {
		if (quantidadeRemover < 0) {
			throw new IllegalArgumentException("A quantidade removida não pode ser negativa!!");
		}

		if (quantidadeRemover > qtdDisponivel) {
			throw new IllegalArgumentException(
					"A quantida removida não pode ser maior que a quantidade disponivel\nQuantidade disponivel: "
							+ getQtdDisponivel() + "\nTentivade remoção: " + quantidadeRemover);

		}
		this.qtdDisponivel -= quantidadeRemover;

	}

}
