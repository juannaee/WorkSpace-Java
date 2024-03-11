package entidade;

public class Contrato {

	private Double valorPorHora;
	private Integer horasTrabalhadas;
	private String nomeContrato;

	public Contrato() {

	}

	public Contrato(String nomeContrato, Double valorPorHora, Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		this.nomeContrato = nomeContrato;
	}

	public String getNomeContrato() {
		return this.nomeContrato;
	}

	public void setNomeContrato(String nomeContrato) {
		this.nomeContrato = nomeContrato;

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
		sb.append("Contrato: ").append(getNomeContrato()).append("\n");
		sb.append("valor por Hora: ").append(valorPorHora).append("\n");
		sb.append("horas Trabalhadas: ").append(horasTrabalhadas).append("\n");
		return sb.toString();
	}

}
