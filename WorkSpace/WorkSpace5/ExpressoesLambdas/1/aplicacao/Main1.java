package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Produto;

public class Main1 {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("teste 1", 2500.00));
		lista.add(new Produto("teste 2", 2556.00));
		lista.add(new Produto("teste 3", 5500.00));
		lista.add(new Produto("teste 4", 7500.00));

		lista.sort((p1, p2) -> p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase()));

//		lista.removeIf(p -> p.getPrecoProduto() >= 5000.00);
		lista.forEach(t -> t.addJuros(0.01));
		lista.forEach(System.out::println);
		List<String> names = lista.stream().map(t -> t.getNomeProduto().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}

}
