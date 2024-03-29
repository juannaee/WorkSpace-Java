package entidades;

public class Produtos {
	private String tipoProduto;
	private Double precoProduto;
	private Integer quantidadeProduto = 0;
	
	
	
	public Produtos() {
		
	}
	
	public Produtos (String tipoProduto) {
		this.tipoProduto = tipoProduto;
		
	}
	
	public String getTipoProduto() {
		return this.tipoProduto;
	}
	
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public Double getPrecoProduto() {
		return this.precoProduto;
	}
	
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
		
	}
	public Integer getQuantidadeProduto() {
		return this.quantidadeProduto;
	}
	
	
	
	

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

	public String toString() {
		return "Tipo: " + ((this.tipoProduto == null) ? "N/D" : this.tipoProduto) + "\n" + "Preço: "
				+ this.precoProduto  + "\n" + "Quantidade produto: " + this.quantidadeProduto + "\n" + "Total: " + precoTotal();

	}

}
