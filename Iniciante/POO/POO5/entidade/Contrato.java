package entidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {

	private final String modeloData = "dd/MM/yyyy";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern(modeloData);
	private Double valorPorHora;
	private Integer horasTrabalhadas;
	private String nomeContrato;
	private LocalDate dataContrato;

	public Contrato() {

	}

	public Contrato(String nomeContrato, Double valorPorHora, Integer horasTrabalhadas, LocalDate dataContrato) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		this.nomeContrato = nomeContrato;
		this.dataContrato = dataContrato;
	}

	public LocalDate getDataContrato() {
		return this.dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;

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
		sb.append("Data: ").append(getDataContrato().format(formatter)).append("\n");
		sb.append("valor por Hora: ").append(valorPorHora).append("\n");
		sb.append("horas Trabalhadas: ").append(horasTrabalhadas).append("\n");
		return sb.toString();
	}

}
