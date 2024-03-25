package entidades;

public class Produto implements Comparable<Produto> {

	private String nomeProduto;
	private Number precoProduto;

	public Produto() {

	}

	public Produto(String nomeProduto, Number precoProduto) {
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

	public Number getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String toString() {
		if (getPrecoProduto() instanceof Double) {
			return getNomeProduto() + ", " + String.format("%.2f", getPrecoProduto());
		} else if (getPrecoProduto() instanceof Integer) {
			return getNomeProduto() + ", " + String.format("%d", getPrecoProduto());
		} else
			return getNomeProduto() + ", " + getPrecoProduto().toString();

	}

	@Override
	public int compareTo(Produto o) {
		return nomeProduto.compareTo(o.nomeProduto);

	}

}
