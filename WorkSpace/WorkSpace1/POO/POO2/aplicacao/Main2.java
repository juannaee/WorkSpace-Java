package aplicacao;

import java.util.Scanner;

import entidades.Produtos;


public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produtos produto1;
		Integer contador;
		Integer quantidade;

		produto1 = new Produtos("Eletronico");

		System.out.println("Valor unitario do produto: ");
		produto1.setPrecoProduto(sc.nextDouble());		
		while (true) {
			System.out.println("1  - Adicionar Produto / 2 - Remover Produto / 3 - Sair");

			try {

				contador = sc.nextInt();
				if (contador == 1) {
					System.out.println("Quantidade a ser adicionado: ");
					quantidade = sc.nextInt();
					produto1.addProduto(quantidade);
					System.out.println("Preço atualizado: " + produto1.precoTotal());

				}
				else if (contador == 2) {
					System.out.println("Quantidade a ser removida: ");
					quantidade = sc.nextInt();
					produto1.removeProduto(quantidade);
					System.out.println("Preço atualizado: " + produto1.precoTotal());

				}
				
				else if(contador == 3) {
					System.out.println("Saindo........");
					break;
				}

				else {
					throw new IllegalArgumentException();

				}

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Entrada invalida! tente novamente, opções validas: 1 - Continuar / 2 - Parar");

			}

		}
		
		System.out.println();
		System.out.println(produto1);
		sc.close();

	}

}
