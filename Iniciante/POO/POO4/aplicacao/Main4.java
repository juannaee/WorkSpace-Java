package aplicacao;

import entidades.Produtos4;

public class Main4 {

	public static void main(String[] args) {
		
		Produtos4 produtos;
		
		produtos = new Produtos4("Teste1 ", 10.00);
		
		produtos.addProdutos(20);
		System.out.println(produtos);
		produtos.removeProdutos(10);
		System.out.println(produtos);
		
		
		

	}

}
