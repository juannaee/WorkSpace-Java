package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresarial;

public class Main6 {

	public static void main(String[] args) {


		Conta cliente2 = new ContaEmpresarial("Jonas");
		cliente2.depositar(800.00);
		System.out.println(cliente2.getSaldo());
		
		

	}

}
