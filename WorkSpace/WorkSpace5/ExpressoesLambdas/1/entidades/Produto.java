package entidades;

public class Produto {

	private String nomeProduto;
	private Double precoProduto;

	public Produto() {

	}

	public Produto(String nomeProduto, Double precoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}
	
	
	public void addJuros(Double percente) {
		this.precoProduto += this.precoProduto * percente;
		
	}
	

	@Override
	public String toString() {
		return "Produto [Nome Produto " + getNomeProduto() + ", Preco Produto " + getPrecoProduto() + "]";
	}
	
	
	

	
}
