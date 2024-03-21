package entidade;

public class ContaEmpresarial extends Conta {

	private Double limiteDeposito;
	private final Double taxEmpresarial = 0.005;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(String nomeCliente) {
		super(nomeCliente);
		this.limiteDeposito = 10000.00;
	}

	public Double getLimiteDeposito() {
		return this.limiteDeposito;
	}

	public Double getTaxEmpresarial() {
		return this.taxEmpresarial;
	}

	@Override
	public void sacar(Double saldo) {

		super.sacar(saldo);
	}

	@Override
	public void depositar(Double valor) {
		if (valor > limiteDeposito) {
			System.out.println("Valor cima do limite permitido! ");

		} else {
			Double tax = valor * taxEmpresarial;
			valor -= tax;
			System.out.println("Taxa de: " + String.format("%.3f", taxEmpresarial) + " Contida para o banco" + "\n"
					+ "Valor: " + String.format("%.2f", tax));
			super.depositar(valor);
		}

	}

}
