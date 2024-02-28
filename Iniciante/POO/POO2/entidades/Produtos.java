package entidades;

public class Produtos {
	public String tipoProduto;
	public Double precoProduto = 0.0;
	private Integer quantidadeProduto = 0;

	public void addProduto(Integer valor) {
		this.quantidadeProduto += valor;

	}

	public void removeProduto(Integer valor) {
		if (this.quantidadeProduto < valor) {
			System.out.println("A quantidade produtos removido foi excedida!");
			this.quantidadeProduto = 0;
			return;

		}

		this.quantidadeProduto -= valor;

	}

	public Double precoTotal() {

		return Math.max(this.precoProduto * this.quantidadeProduto, 0.0);
	}

}
