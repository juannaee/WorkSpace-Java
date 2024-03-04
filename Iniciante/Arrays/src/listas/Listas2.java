package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista;
		lista = new ArrayList<>();

		while (true) {

			System.out.println("1 - ADD / 2 - SAIR / 3 - VER LISTA");
			Integer opcap = sc.nextInt();

			if (opcap == 1) {
				System.out.println("Digite um nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				lista.add(nome);

			} else if (opcap == 2) {
				System.out.println("Saindo");
				break;

			} else if (opcap == 3) {
				
				Integer index = 0;

				if (lista.isEmpty()) {
					System.out.println("Lista vazia");
				}
				for (Object item : lista) {
					System.out.println(index + " - " +  item);
					index++;
				}

			} else {
				System.out.println("OPÇÃO INDISPONIVEL!!!!!!!");
			}

		}

		sc.close();

	}

}
