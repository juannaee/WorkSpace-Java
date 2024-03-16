package aplicacao;

import model.entidades.Banco;
import model.entidades.Mercado;
import model.entidades.ServicoTaxaBrazil;
import model.exception.ExceptionsPersonalizada;

public class Main {

	public static void main(String[] args) throws ExceptionsPersonalizada {
		ServicoTaxaBrazil taxBrazil = new ServicoTaxaBrazil();
		Banco banco = new Banco(9000.00, taxBrazil);
		Mercado mercado = new Mercado(banco);

		mercado.pegarEmprestimo(10000.00);
		System.out.println(mercado.getCaixa());

	}

}
