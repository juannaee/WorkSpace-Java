package logica;

public enum OrdemStatus {
	PROCESSANDO("A ordem esta sendo processada"), COMPLETA("A ordem foi concluida");

	private final String descricao;

	OrdemStatus(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	
	public Boolean isProcessando() {
		return this == PROCESSANDO;
	}
	
	public Boolean isCompleta() {
		return this == COMPLETA;
	}

}
