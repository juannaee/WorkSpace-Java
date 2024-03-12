package aplicacao;

import java.time.LocalDate;

import entidade.Departamento;
import entidade.Trabalhador;
import enums.CargoTrabalhador;
import enums.DepartamentoLogica;

public class Main5 {

	public static void main(String[] args) {

		LocalDate dataContrato = LocalDate.of(2024, 03, 12);
		Departamento departamento = new Departamento();
		Trabalhador trabalhador1 = new Trabalhador("Juan Guilherme", 22, CargoTrabalhador.SENIOR,
				DepartamentoLogica.DESENVOLVIMENTO);
		trabalhador1.getSetor().setAnosEmpresa(10);
		trabalhador1.addContrato("Contrato 1", 80.50, 90, dataContrato);
		trabalhador1.addContrato("Contrato 2", 35.60, 150, dataContrato);
		trabalhador1.addContrato("Contrato 3", 15.60, 250, dataContrato);
		departamento.addTrabalhadores(trabalhador1);

		System.out.println("--------------------------------------------");
		Trabalhador trabalhador2 = new Trabalhador("Jonas", 37, CargoTrabalhador.JUNIOR, DepartamentoLogica.CINEMA);
		trabalhador2.addContrato("Contrato 1", 50.75, 60, dataContrato);
		trabalhador2.addContrato("Contrato 2", 56.90, 36, dataContrato);
		trabalhador2.addContrato("Contrato 3", 10.00, 20, dataContrato);
		trabalhador2.getSetor().setAnosEmpresa(3);
		departamento.addTrabalhadores(trabalhador2);
		System.out.println(departamento);

	}

}
