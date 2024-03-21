package model.entidade;

public class Funcionario implements Comparable<Funcionario> {

	private String nomeFuncionario;
	private Double salarioFuncionario;

	public Funcionario() {

	}

	public Funcionario(String nomeFuncionario, Double salarioFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	@Override
	public int compareTo(Funcionario o) {

		return salarioFuncionario.compareTo(o.getSalarioFuncionario());
	}

}
