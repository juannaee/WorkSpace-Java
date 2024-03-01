package entidades;

public class Conta {

	private String nomeCliente;
	private Double saldoCliente = 0.0;

	public Conta() {

	}

	public Conta(String nomeCliente) {
		this.nomeCliente = nomeCliente;

	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldoCliente() {
		return this.saldoCliente;
	}

	public void depositarSaldo(Double valor) {
		this.saldoCliente += valor;
	}

	public void sacarSaldo(Double valor) {
		if (valor > this.saldoCliente) {
			System.out.println("Valor de saque indisponivel!" + "\n" + "Motivo: " + "\n" + "Saldo disponivel: "
					+ getSaldoCliente() + "\n" + "Tentativa de saque: " + valor);
		}
		this.saldoCliente -= valor;

	}

	public String toString() {
		return "Nome: " + ((this.nomeCliente == null) ? "N/D" : this.nomeCliente) + "\n" + "Saldo: " + "R$ "
				+ String.format("%.2f", saldoCliente);
	}

}


