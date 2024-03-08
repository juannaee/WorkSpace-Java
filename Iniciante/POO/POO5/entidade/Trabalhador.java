package entidade;

import java.util.ArrayList;
import java.util.List;

import enums.CargoTrabalhador;

public class Trabalhador {

	private String nomeCompleto;
	private Integer idade;
	private CargoTrabalhador cargo;
	private String setor;
	private List<Contrato> contratos = new ArrayList<Contrato>();
	private final Double taxContrato = 0.4;
	private final Double taxSalario = 0.05;

	public Trabalhador() {

	}

	public Trabalhador(String nomeCompleto, Integer idade, CargoTrabalhador cargo, String setor) {
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.cargo = cargo;
		this.setor = setor;

	}

	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public CargoTrabalhador getCargo() {
		return cargo;
	}

	public void setCargo(CargoTrabalhador cargo) {
		this.cargo = cargo;

	}

	public void addContrato(Double valorPorHora, Integer horasTrabalhadas) {
		Contrato contrato = new Contrato(valorPorHora, horasTrabalhadas);
		contratos.add(contrato);
	}

	public Double lucroContratos() {
		Double ganhoTotal = 0.0;

		for (Contrato contrato : contratos) {
			ganhoTotal += contrato.ganhoTotal();

		}

		return ganhoTotal;
	}

	public Double salarioTotal() {
		return cargo.SalarioBruto() + lucroContratos();
	}

	public Double taxaDepartamentoContrato() {
		return lucroContratos() * taxContrato;
	}

	public Double taxaDepartamentoSalario() {
		return cargo.SalarioBruto() * taxSalario;
	}

	public Double taxaDepartamentoTotal() {
		return taxaDepartamentoContrato() + taxaDepartamentoSalario();
	}

	public Double salarioLiquido() {
		return salarioTotal() - taxaDepartamentoContrato() - taxaDepartamentoSalario();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------------------------------" + "\n");
		sb.append("Trabalhador: ").append(nomeCompleto).append("\n");
		sb.append("Idade: ").append(idade).append("\n");
		sb.append("Cargo: ").append(setor != null ? setor : "Não definido").append("\n");
		sb.append("\n");

		sb.append("Contratos:\n");
		for (Contrato contrato : contratos) {
			sb.append("\t").append(contrato).append("\n");
		}
		sb.append("Ganho total com contratos: ").append(String.format("%.2f", lucroContratos())).append("\n");
		sb.append("Valor Taxa para departamento: ").append(String.format("%.2f", taxaDepartamentoContrato()))
				.append("\n");
		sb.append("Taxa:").append(String.format("%.2f", taxContrato)).append("\n");
		sb.append("\n");

		sb.append(cargo);
		sb.append("Salário total: ").append(String.format("%.2f", salarioTotal())).append("\n");
		sb.append("Valor taxa para o departamento: ").append(String.format("%.2f", taxaDepartamentoSalario()))
				.append("\n");
		sb.append("Taxa:").append(String.format("%.2f", taxSalario)).append("\n");
		sb.append("Salário liquido: ").append(String.format("%.2f", salarioLiquido())).append("\n");
		sb.append("\n");

		sb.append("Taxa total para departamento: ").append(String.format("%.2f", taxaDepartamentoTotal())).append("\n");

		sb.append("-------------------------------------------------------" + "\n");
		return sb.toString();
	}

}
