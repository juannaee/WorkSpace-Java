package entidade;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private Double caixa;
	private List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();

	public Departamento() {

	}

	public Double getCaixa() {
		return this.caixa;
	}

	public void mostrarTrabalhadores() {
		System.out.println(trabalhadores);
	}

	public Double lucroTotal() {
		Double lucroTotal = 0.0;
		for (Trabalhador trabalhador : trabalhadores) {
			lucroTotal += trabalhador.taxaDepartamentoTotal();
		}
		return lucroTotal;
	}

	public void addTrabalhadores(Trabalhador trabalhador) {
		trabalhadores.add(trabalhador);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Caixa: ").append(lucroTotal() != null ? String.format("%.2f", lucroTotal()) : "Não definido")
				.append("\n");
		sb.append("Trabalhadores:\n");
		for (Trabalhador trabalhador : trabalhadores) {
			sb.append(trabalhador).append("\n");
		}

		sb.append("\n");

		sb.append("Caixa do departamento: " + String.format("%.2f", lucroTotal()));
		return sb.toString();
	}

}
