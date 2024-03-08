package enums;

public enum CargoTrabalhador {
	JUNIOR("Junior", 2500.50, 0.05), PLENO("Pleno", 6500.50, 0.08), SENIOR("Senior", 8500.50, 0.10);

	private final String descricao;
	private final Double salarioBase;
	private final Double bonus;

	private CargoTrabalhador(String descricao, Double salarioBase, Double bonus) {
		this.descricao = descricao;
		this.salarioBase = salarioBase;
		this.bonus = bonus;

	}

	public String getDescricao() {
		return this.descricao;
	}

	public Double getSalarioBase() {
		return this.salarioBase;
	}

	public Double getBonus() {
		return this.bonus;
	}

	public Double SalarioBruto() {
		return salarioBase + (salarioBase * bonus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Detalhes do cargo: ").append("\n");
		sb.append("Nivel = ").append(descricao).append("\n");
		sb.append("Salário Base: ")
				.append(getSalarioBase() != null ? String.format("%.2f", getSalarioBase()) : "Não definido")
				.append("\n");
		sb.append("Bonus por Nivel = ").append(getBonus() != null ? String.format("%.2f", getBonus()) : "Não definido").append("\n");
		return sb.toString();
	}

}
