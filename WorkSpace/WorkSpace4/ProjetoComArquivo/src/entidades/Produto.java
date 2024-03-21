package entidades;

public class Produto implements Comparable<Produto> {

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

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String toString() {
		return getNomeProduto() + ", " + String.format("%.2f", getPrecoProduto());
	}

	@Override
	public int compareTo(Produto o) {
		return precoProduto.compareTo(o.getPrecoProduto());

	}

}
