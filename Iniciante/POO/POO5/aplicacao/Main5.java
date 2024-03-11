package aplicacao;

import entidade.Departamento;
import entidade.Trabalhador;
import enums.CargoTrabalhador;
import enums.DepartamentoLogica;

public class Main5 {

	public static void main(String[] args) {
		Departamento departamento = new Departamento();
		Trabalhador trabalhador1 = new Trabalhador("Juan Guilherme", 22, CargoTrabalhador.SENIOR,
				DepartamentoLogica.DESENVOLVIMENTO);
		trabalhador1.getSetor().setAnosEmpresa(10);
		trabalhador1.addContrato("Contrato 1", 80.50, 90);
		trabalhador1.addContrato("Contrato 2", 35.60, 150);
		trabalhador1.addContrato("Contrato 2", 15.60, 250);
		departamento.addTrabalhadores(trabalhador1);

		System.out.println("--------------------------------------------");
		Trabalhador trabalhador2 = new Trabalhador("Jonas", 37, CargoTrabalhador.JUNIOR, DepartamentoLogica.CINEMA);
		trabalhador2.addContrato("Contrato 1", 50.75, 60);
		trabalhador2.getSetor().setAnosEmpresa(1);
		departamento.addTrabalhadores(trabalhador2);

		System.out.println(departamento);

	}

}
