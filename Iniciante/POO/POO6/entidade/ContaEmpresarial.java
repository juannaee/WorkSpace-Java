package entidade;

public class ContaEmpresarial extends Conta {

	private Double limiteDeposito;

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

	@Override
	public void depositar(Double valor) {
		if (valor > limiteDeposito) {
			System.out.println("Valor cima do limite permitido! ");

		} else {
			super.depositar(valor);
		}

	}

}
