package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produtos4;
import logica.OrdemStatus;

public class Main4 {

	public final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Produtos4> lista;
		lista = new ArrayList<Produtos4>();
		Integer opcao;

		while (true) {
			System.out.println("Bem Vindo, Escolha uma opção" + "\nOpções diponiveis:" + "\n1 - Ver lista de produtos\n"
					+ "2 - Editar Produtos" + "\n3 - Excluir Produtos" + "\n4 - Adicionar Produtos" + "\n5 - Sair");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1: {
				linhaDeSeparacao();
				mostrarLista(lista);
				linhaDeSeparacao();
				break;
			}
			case 2: {

				linhaDeSeparacao();
				System.out.println("Em produção.......");
				linhaDeSeparacao();
				break;
			}
			case 3: {
				linhaDeSeparacao();
				removeProdutos(lista);
				linhaDeSeparacao();
				break;
			}
			case 4: {
				linhaDeSeparacao();
				addProdutos(lista);
				linhaDeSeparacao();
				break;
			}
			case 5: {
				System.out.println("Saindo..............");
				sc.close();
				System.exit(0);
			}
			default:
				System.out.println("Opção invalida!" + "\nOpções diponiveis:" + "\n1 - Ver lista de produtos\n"
						+ "2 - Editar Produtos" + "\n3 - Excluir Produtos" + "\n4 - Adicionar Produtos" + "\n5 - Sair");

			}

		}

	}

	private static <E> void mostrarLista(List<E> lista) {
		Integer indice = 0;
		if (lista.isEmpty()) {
			System.out.println("Lista vazia");
		}

		for (Object item : lista) {
			System.out.println("ID: " + indice + "\n" + item + "\n");
			indice++;
		}
	}

	private static void addProdutos(List<Produtos4> lista) {
		Integer opcao;
		Integer quantidade;
		Produtos4 produtos;
		System.out.println("Qual o nome do produto: ");
		String nomeProduto = sc.nextLine();
		System.out.println("Preço unitario: ");
		Double precoProduto = sc.nextDouble();
		sc.nextLine();
		lista.add(produtos = new Produtos4(nomeProduto, precoProduto));
		produtos.setStatusOrdem(OrdemStatus.PROCESSANDO);
		while (true) {
			System.out.println("Escolha uma opção\n1 - Adicionar Unidades\n2 - Remover Unidades\n3 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1: {
				System.out.println("Quantidade: ");
				quantidade = sc.nextInt();
				produtos.addProdutos(quantidade);
				linhaDeSeparacao();
				System.out.println("-------Produto atualizado-------" + "\n" + "\n" + produtos + "\n");
				linhaDeSeparacao();
				break;
			}

			case 2: {
				System.out.println("Quantidade: ");
				quantidade = sc.nextInt();
				produtos.removeProdutos(quantidade);
				linhaDeSeparacao();
				System.out.println("-------Produto atualizado-------" + "\n" + "\n" + produtos + "\n");
				linhaDeSeparacao();
				break;
			}
			case 3: {
				linhaDeSeparacao();
				produtos.setStatusOrdem(OrdemStatus.COMPLETA);
				System.out.println(
						"Certo! Salvando Atualizações.........\n" + "Produto aualizado: " + "\n" + produtos + "\n");
				linhaDeSeparacao();

				return;

			}

			default:

				System.out.println(
						"Opção invalida! \nOpções disponiveis:\n1 - Adicionar Unidades\n2 - Remover Unidades\n3 - Sair");

			}

		}
	}

	private static void linhaDeSeparacao() {

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
	}

	private static void removeProdutos(List<Produtos4> lista) {
		System.out.println("Escolha um produto para remover pelo ID\nProdutos em estoque:\n");
		mostrarLista(lista);
		System.out.print("ID: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		lista.remove((int) id);
		System.out.println("Produto removido com sucesso!\n");
		System.out.println("Lista Atualizada:\n");
		mostrarLista(lista);

	}

}
