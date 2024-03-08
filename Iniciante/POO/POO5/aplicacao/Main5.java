package aplicacao;

import entidade.Departamento;
import entidade.Trabalhador;
import enums.CargoTrabalhador;

public class Main5 {

	public static void main(String[] args) {

		
		Trabalhador trabalhador1 = new Trabalhador("Juan Guilherme", 22, CargoTrabalhador.SENIOR, "Desenvolvedor");
		Departamento departamento = new Departamento("Desenvolvimento");
		departamento.addTrabalhadores(trabalhador1);
		System.out.println(departamento);

	}

}
