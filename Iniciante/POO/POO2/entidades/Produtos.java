package entidades;

public class Produtos {
	String tipoProduto;
	Double precoProduto;
	Integer quantidadeProduto;
	
	
	
	
	
	public void addProduto(Integer valor) {
		quantidadeProduto += valor;
		
	}
	
	public Double precoTotal() {
		return precoProduto * quantidadeProduto;
	}

}