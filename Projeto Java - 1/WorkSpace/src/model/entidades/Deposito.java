package model.entidades;

public abstract class Deposito {

	protected String nomeProduto;
	protected Double precoProduto;
	protected Integer qtdDisponivel;

	public Deposito(String nomeProduto, Double precoProduto, Integer qtdDisponivel) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.qtdDisponivel = qtdDisponivel;

	}

	public abstract Double calcularValorTotal();

	public abstract void addProduto(Integer quantidadeAdd);

	public abstract void removerProduto(Integer quantidadeRemover);

}
