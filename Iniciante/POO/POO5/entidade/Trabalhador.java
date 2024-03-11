package entidade;

import java.util.ArrayList;
import java.util.List;

import enums.CargoTrabalhador;
import enums.DepartamentoLogica;

public class Trabalhador {

	private String nomeCompleto;
	private Integer idade;
	private CargoTrabalhador cargo;
	private List<Contrato> contratos = new ArrayList<Contrato>();
	private final Double taxContrato = 0.8;
	private final Double taxSalario = 0.08;
	private DepartamentoLogica setor;

	public Trabalhador() {

	}

	public Trabalhador(String nomeCompleto, Integer idade, CargoTrabalhador cargo, DepartamentoLogica setor) {
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.cargo = cargo;
		this.setor = setor;

	}

	public DepartamentoLogica getSetor() {
		return this.setor;
	}

	public void setSetor(DepartamentoLogica setor) {
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

	public void addContrato(String nomeContrato, Double valorPorHora, Integer horasTrabalhadas) {
		Contrato contrato = new Contrato(nomeContrato, valorPorHora, horasTrabalhadas);
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

	public Double salarioLiquidoSemBonus() {
		return salarioTotal() - taxaDepartamentoContrato() - taxaDepartamentoSalario();
	}

	public Double salarioLiquido() {
		return salarioTotal() - taxaDepartamentoContrato() - taxaDepartamentoSalario() + setor.bonusPorAno();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------------------------------" + "\n");
		sb.append("Trabalhador: ").append(nomeCompleto).append("\n");
		sb.append("Idade: ").append(idade).append("\n");
		sb.append("Setor: ").append(setor.getDescricao() != null ? setor.getDescricao() : "Não definido").append("\n");
		sb.append("\n");

		sb.append("Contratos:\n");
		for (Contrato contrato : contratos) {
			sb.append(contrato).append("\n");
		}

		sb.append("Ganho total com contratos: ").append(String.format("%.2f", lucroContratos())).append("\n");
		sb.append("Taxa de " + String.format("%.2f", taxContrato) + "%" + " para departamento: ")
				.append(String.format("%.2f", taxaDepartamentoContrato())).append("\n");

		sb.append("\n");
		sb.append(cargo);
		sb.append("Salário total: ").append(String.format("%.2f", salarioTotal())).append("\n");
		sb.append("taxa de " + String.format("%.2f", taxSalario) + "%" + " para o departamento: ")
				.append(String.format("%.2f", taxaDepartamentoSalario())).append("\n");

		sb.append("Bonus por ano: ").append(String.format("%.2f", setor.bonusPorAno())).append("\n");
		sb.append("Salário liquido: ").append(String.format("%.2f", salarioLiquido())).append("\n");

		sb.append("\n");

		sb.append("-------------------------------------------------------" + "\n");
		sb.append("Calculo remuneração: " + "\nSalario Bruto: " + String.format("%.2f", cargo.getSalarioBase()) + " + "
				+ cargo.bonus() + " = " + String.format("%.2f", cargo.SalarioBruto()) + " + "
				+ String.format("%.2f", lucroContratos()) + " = " + String.format("%.2f", salarioTotal()) + "\n");

		sb.append("Salario liquido: " + String.format("%.2f", salarioTotal()) + " - "
				+ String.format("%.2f", taxaDepartamentoContrato()) + " - "
				+ String.format("%.2f", taxaDepartamentoSalario()) + " + " + String.format("%.2f", setor.bonusPorAno())
				+ " = " + String.format("%.2f", salarioLiquido()) + "\n");
		sb.append("-------------------------------------------------------" + "\n");

		sb.append("Taxa total para departamento: ").append(String.format("%.2f", taxaDepartamentoTotal())).append("\n");

		sb.append("-------------------------------------------------------" + "\n");
		return sb.toString();
	}

}
