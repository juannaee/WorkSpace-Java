package enums;

public enum DepartamentoLogica {

	DESENVOLVIMENTO("Desenvolvimento", 0), DESIGNER("Designer", 0), CINEMA("Cinema", 0);

	private final String descricacao;
	private Integer anosEmpresa;

	private DepartamentoLogica(String descricao, Integer anosEmpresa) {
		this.descricacao = descricao;
		this.anosEmpresa = anosEmpresa;

	}

	public String getDescricao() {
		return this.descricacao;
	}

	public Integer getAnosEmpresa() {
		return this.anosEmpresa;
	}

	public void setAnosEmpresa(Integer anosEmpresa) {
		this.anosEmpresa = anosEmpresa;
	}

	public Double bonusPorAno() {
		if (anosEmpresa == 1) {
			return 100.00;
		} else if (anosEmpresa >= 2 && anosEmpresa < 5) {
			return 300.00;
		} else if (anosEmpresa >= 5 && anosEmpresa < 10) {
			return 500.00;
		} else if (anosEmpresa >= 10) {
			return 1000.00;
		} else {
			return 0.0;
		}
	}
}
