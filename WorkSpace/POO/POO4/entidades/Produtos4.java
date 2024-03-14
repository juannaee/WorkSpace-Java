package entidades;

import logica.OrdemStatus;

public class Produtos4 {

	private String nomeProduto;
	private Double precoUnitProduto;
	private Integer qtdProduto;
	private OrdemStatus statusOrdem;
	private Produtos4Util produtosUtil;

	public Produtos4() {
	}

	public Produtos4(String nomeProduto, Double precoUnitProduto) {
		this.nomeProduto = nomeProduto;
		this.precoUnitProduto = precoUnitProduto;
		this.qtdProduto = 0;
		this.statusOrdem = null;
		this.produtosUtil = new Produtos4Util();

	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public OrdemStatus getStatusOrdem() {
		return statusOrdem;
	}

	public void setStatusOrdem(OrdemStatus statusOrdem) {
		this.statusOrdem = statusOrdem;
	}

	public Double getPrecoUnitProduto() {
		return precoUnitProduto;
	}

	public Integer getQtdProduto() {
		return qtdProduto;
	}

	public void addProdutos(Integer quantidadeAdd) {
		this.qtdProduto = produtosUtil.addProduto(quantidadeAdd, this.qtdProduto);
	}

	public void removeProdutos(Integer quantideRemove) {
		this.qtdProduto = produtosUtil.removerProduto(quantideRemove, this.qtdProduto);
	}

	public Double precoTotal() {
		return getPrecoUnitProduto() * getQtdProduto();
	}

	public String toString() {
		return "Detalhes do Pedido:\n" + " - Nome: " + getNomeProduto() + "\n" + "  - Preço Unitário: "
				+ getPrecoUnitProduto() + "\n" + "  - Quantidade: " + getQtdProduto() + "\n" + "  - Preço Total: "
				+ precoTotal() + "\n" + "  - Status: " + statusOrdem.getDescricao() + "\n";

	}

	class Produtos4Util {

		/**
		 * Adiciona a quantidade especificada de produtos.
		 * 
		 * @throws IllegalArgumentException Se a quantidade for negativa.
		 * @param quantidade, A quantidade de produtos a ser adicionada.
		 */

		public Integer addProduto(Integer quantidadeAdd, Integer qtdProduto) {
			verificacaoNegativa(quantidadeAdd);
			return qtdProduto + quantidadeAdd;
		}

		/**
		 * Remove a quantidade especificada de produtos.
		 * 
		 * @throws IllegalArgumentException, Se o valor for maior que a quantidade
		 * @throws IllegalArgumentException, Se a quantidade for negativa
		 * @param quantidade, A quantidade de produtos a ser removida
		 */
		public Integer removerProduto(Integer quantidade, Integer qtdProduto) {
			verificacaoNegativa(quantidade);
			if (verificaoQuantidade(quantidade, qtdProduto)) {
				qtdProduto = 0;
				quantidade = 0;
			}
			return qtdProduto - quantidade;
		}

		/**
		 * Verificação de valores negativos
		 * 
		 * @throws IllegalArgumentException Se o valor for negativo
		 * @param valor, Valor verificado
		 */

		private void verificacaoNegativa(Integer valor) {
			if (valor < 0) {
				throw new IllegalArgumentException("Quantidade negativa inserida: " + valor);

			}
		}

		/**
		 * @throws IllegalArgumentException, Se o valor for maior que a quantidade
		 * @param valor,       Valor a ser inserido pelo usuario
		 * @param qtdProdutos, Quantidade de produtos disponivel
		 */
		private Boolean verificaoQuantidade(Integer valor, Integer qtdProdutos) {
			if (valor > qtdProdutos) {
				System.out.println("\n\nErro: Quantidade de itens insuficiente\n\nDetalhes:\n" + "Valor inserido: "
						+ valor + "\n" + "Quantidade disponível: " + qtdProdutos + "\n");
				return true;
			}
			return false;
		}

	}

}
