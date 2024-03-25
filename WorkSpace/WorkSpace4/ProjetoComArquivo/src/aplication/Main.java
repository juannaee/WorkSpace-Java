package aplication;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import services.ServicoDeCalculo;

public class Main {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();
		Integer contador = 10;

		for (int i = 1; i <= contador; i++) {
			Produto produto = new Produto("Produto " + i , i * 1000);
			lista.add(produto);

		}

		Produto teste1 = ServicoDeCalculo.max(lista);
		Produto teste2 = ServicoDeCalculo.min(lista);
		System.out.println(teste1);
		System.out.println(teste2);
		
		

	}

}
