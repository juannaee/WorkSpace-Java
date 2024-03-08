package entidade;

public class Contrato {

	private Double valorPorHora;
	private Integer horasTrabalhadas;

	public Contrato() {

	}

	public Contrato(Double valorPorHora, Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public Double getValorPorHora() {
		return this.valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;

	}

	public Integer getHorasTrabalhadas() {
		return this.horasTrabalhadas;

	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;

	}

	public Double ganhoTotal() {
		return getValorPorHora() * getHorasTrabalhadas();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contrato:\n");
		sb.append("valorPorHora=").append(valorPorHora).append("\n");
		sb.append("horasTrabalhadas=").append(horasTrabalhadas).append("\n");
		return sb.toString();
	}

}
